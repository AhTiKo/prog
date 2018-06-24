  int ledPin = 13;
  int inPin = 5;
  int val = 0;
void setup() {
  // put your setup code here, to run once:
  pinMode(ledPin, OUTPUT);
  pinMode(inPin,INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
//  val = digitalRead(inPin);
//  if(val == HIGH ){
//     digitalWrite(13,LOW);
//  } else {
    digitalWrite(13,HIGH);
  delay(100);
  digitalWrite(13,LOW);
    delay(100);
//  }
  
}
