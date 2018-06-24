const int button = 12;   
const int carGreen = 3;
const int carYellow = 4;     
const int carRed = 5;
const int pedestrianGreen = 7;
const int pedestrianRed = 8;
const long interval = 10000; 
int buttonState;
int lastButtonState;
unsigned long previousMillis = 0;
int currentCarLight;
boolean pedestrianGo;

void setup() {
  pinMode(button, INPUT);
  pinMode(carGreen, OUTPUT);
  pinMode(carYellow, OUTPUT);
  pinMode(carRed, OUTPUT);
  pinMode(pedestrianGreen, OUTPUT);
  pinMode(pedestrianRed,OUTPUT);
  
  digitalWrite(carGreen,HIGH);
  currentCarLight = carGreen;
  digitalWrite(pedestrianRed,HIGH);

  buttonState = LOW;
  lastButtonState = LOW;
  pedestrianGo = false;
  
}

void pedestrianChange(void){
  digitalWrite(pedestrianRed,LOW);
  digitalWrite(pedestrianGreen,HIGH);
  delay(9000);
   for(int i = 0; i < 5 ; i++){
    digitalWrite(pedestrianGreen,LOW);
    delay(200);
    digitalWrite(pedestrianGreen,HIGH);
    delay(200);
  }
  digitalWrite(pedestrianGreen,LOW);
  
  digitalWrite(pedestrianRed,HIGH);
}

void changeCarLight(int light){
  if(light == carGreen){
    digitalWrite(carGreen,LOW);
    blinkYellow();
    digitalWrite(carRed,HIGH);
    currentCarLight = carRed;
  }else if(light == carRed){
    digitalWrite(carRed,LOW);
    digitalWrite(carGreen,HIGH);
    currentCarLight = carGreen;
    previousMillis = millis();
  }
}
void blinkYellow(){
  for(int i = 0; i < 5; i++){
     digitalWrite(carYellow,HIGH);
     delay(200);
     digitalWrite(carYellow,LOW);
     delay(200);
  }
}


void loop() {
  unsigned long currentMillis = millis();
  
  if(currentMillis - previousMillis >= interval){
    previousMillis = currentMillis;
    changeCarLight(currentCarLight);
  }
  buttonState = digitalRead(button);
  if(buttonState != lastButtonState){
    if(buttonState == HIGH){
      pedestrianGo = true;
      
    }
  }
  if(pedestrianGo && currentCarLight == carGreen){
       delay(3000);
       changeCarLight(currentCarLight);
       pedestrianChange();
       changeCarLight(currentCarLight);
      pedestrianGo = false; 
  }
  lastButtonState = buttonState;
}
