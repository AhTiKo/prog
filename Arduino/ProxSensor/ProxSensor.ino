const int forwardSensor = 4;
const int leftSensor = 5 ;
const int rightSensor = 6;
int prevStatusforwa = 1;
int currentStatus = 1;

void setup() {
pinMode(13,OUTPUT);
pinMode(ProxSensor,INPUT);
Serial.begin(9600);
}

void loop() {
  currentStatus = digitalRead(ProxSensor);
  if(currentStatus != prevStatus){
    if(currentStatus == HIGH){
      Serial.println(" Highway");
    }else{
      Serial.println(" Barrier");
    }
    digitalWrite(13,currentStatus); 
  }
  delay(100);
  prevStatus = currentStatus;
}
