int ledRedPin = 13;
int ledGreenPin = 12;
int buttonPin = 5;
int valBut = 0;
boolean light = false;
void setup() {
  pinMode(ledRedPin,OUTPUT);
  pinMode(ledGreenPin,OUTPUT);
  pinMode(buttonPin,INPUT);
}

void loop() {
  valBut = digitalRead(buttonPin);
  if (valBut == HIGH && light){
    digitalWrite(ledGreenPin,HIGH);
    digitalWrite(ledRedPin,LOW);
    light = false;
  } else if(valBut == HIGH && !light){
    digitalWrite(ledRedPin,HIGH);
    digitalWrite(ledGreenPin,LOW);
  }

}
