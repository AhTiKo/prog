#define IRSensorLeft    10   // left sensor input pin
#define IRSensorMiddle  9  // middle sensor input pin
#define IRSensorRight   8  // right sensor input pin
unsigned char IRSL;        // left sensor status
unsigned char IRSM;        // middle sensor status 
unsigned char IRSR;        // right sensor status
#define E1  3    
#define E2  11   
#define M1  12            
#define M2  13   
int val;
int direct;
int curSpeed;   

void M_Control_IO_config(void)// initialization function of motor driver shield IO 
{
  pinMode(M1,OUTPUT); // 
  pinMode(M2,OUTPUT); // 
  pinMode(E1,OUTPUT); // 
  pinMode(E2,OUTPUT); //   
} 
  
void Sensor_IO_Config()
{
  pinMode(IRSensorLeft,INPUT);
  pinMode(IRSensorMiddle,INPUT);
  pinMode(IRSensorRight,INPUT);
}
void Sensor_Scan(void)
{
  IRSL = digitalRead(IRSensorLeft);
  IRSM = digitalRead(IRSensorMiddle);
  IRSR = digitalRead(IRSensorRight);
}

void advance(void)     // move forward
{
    digitalWrite(M1,LOW);    // right wheel moves forward
    digitalWrite(M2, LOW);  // left wheel moves forward
    analogWrite(E1,curSpeed);   
    analogWrite(E2, curSpeed);
}
void turnR(void)        // turn right 
{
   digitalWrite(M1,LOW);  // left wheel moves forward
   digitalWrite(M2,HIGH); // right wheel moves backward
   analogWrite(E1,curSpeed);   
   analogWrite(E2, curSpeed);
}
void turnL(void)        // turn left 
{
   digitalWrite(M1,HIGH);   // left wheel moves backwards
   digitalWrite(M2, LOW);   // right wheel moves forward
   analogWrite(E1,curSpeed);   
   analogWrite(E2, curSpeed);
}    
void stopp(void)              // stop 
{
    digitalWrite(M1,LOW);    
    digitalWrite(M2, LOW);  
    analogWrite(E1, 0);   
    analogWrite(E2, 0);  // both left and right wheels stop
}
void back(void)            // move backward
{
   digitalWrite(M1,HIGH);   // both left and right wheels move forward
   digitalWrite(M2, HIGH);  
   analogWrite(E1,curSpeed);   
   analogWrite(E2, curSpeed);
}

void exit(void)
{
  stopp();
  back();
  delay(500);
  turnR();
  delay(500);
}

void contin(){
  if(direct == '1'){
    advance();
  };
  if(direct == '2'){
    back();
  };
  if(direct == '3'){
    turnR();
  };
  if(direct == '4'){
    turnL();
  }
}

void acceleration(int accsel){
  switch(curSpeed){
    case 175: if(accsel == 1){
                  curSpeed = 255;
              }else {
                  curSpeed = 100;
              };break;
    case 100: if(accsel == 1){
                 curSpeed = 175;
              };break;
    case 255: if(accsel == -1){
                 curSpeed = 175;
              };break;
    default:break;
  }
  if(accsel == 0){
    curSpeed = 175;
  }
}

void autoControl(){
  while(!(IRSL==1&&IRSM==1&&IRSR==1)){
   if((IRSL==0&&IRSM==0&&IRSR==1)||(IRSL==0&&IRSM==1&&IRSR==1)||(IRSL==1&&IRSM==0&&IRSR==1)){
       turnL();
    };
   if((IRSL==1&&IRSM==0&&IRSR==0)||(IRSL==1&&IRSM==1&&IRSR==0)){
       turnR();
   };
   if(IRSL==0&&IRSM==0&&IRSR==0){
      exit(); 
    };
   Sensor_Scan();
   }
advance();
direct = '1';
}

void setup() 
{ 
   Serial.begin(9600);
   Sensor_IO_Config();
   M_Control_IO_config();        // initialization of motor driver shield IO
   stopp();
   direct = '9';
} 
unsigned char old_IRSL,old_IRSM,old_IRSR;
void loop() 
{
Sensor_Scan();
val=Serial.read();
    if(val=='1'){
      advance();
      direct = '1';
    }

    if(val=='2'){
       back();
       direct = '2';
    }

    if(val=='4'){
       turnL();
       direct = '4';
    }

    if(val=='3'){
       turnR();
       direct = '3';
    }

    if(val=='9'){
       stopp();
       direct = '9';
       curSpeed = 175;
    };

    if(val=='A'){
       acceleration(0);
       contin();  
    }

    if(val=='7'){
       acceleration(1);
       contin();  
    }

    if(val=='8'){
        acceleration(-1);
        contin();  
    }

   if(IRSL==0 || IRSM==0 || IRSR==0){
       autoControl();
   }
} 


