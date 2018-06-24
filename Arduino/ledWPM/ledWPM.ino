int ledPin = 13;
int inPin = 5;
int val = 0;
int h = 100;
int l = 100;

void setup() {
  pinMode(ledPin, OUTPUT);
  pinMode(inPin, INPUT);
  Serial.begin(115200);
}

void loop() {
    val = digitalRead(inPin);
    if(val == HIGH){
      h = h + 20;
      Serial.println(h);
      l = l + 20;
      Serial.println(l);
    } else {
          digitalWrite(ledPin,HIGH);
          delay(h);
           digitalWrite(ledPin,LOW);
           delay(l);
    }
    delay(200);
}
