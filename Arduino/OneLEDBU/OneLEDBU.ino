  int ledPin = 13;
//  int ledPin2 = 12;
  int inPin = 5;
  int val = 0;
void setup() {
  // put your setup code here, to run once:
  pinMode(ledPin, OUTPUT);
//  pinMode(ledPin2, OUTPUT);
  pinMode(inPin,INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  val = digitalRead(inPin);
  if(val == HIGH ){
     digitalWrite(ledPin,LOW);
    // digitalWrite(ledPin2,HIGH);
  } else {
    digitalWrite(ledPin,HIGH);
 //   digitalWrite(ledPin2,LOW);
  }
  
}
