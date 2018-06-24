int button = 2;
void setup() {
  pinMode(button,INPUT);
  Serial.begin(9600);
}

void loop() {
  int stateButton = digitalRead(button);
  Serial.println(stateButton);
  delay(10);
}
