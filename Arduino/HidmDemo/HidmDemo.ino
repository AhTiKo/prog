int svetodiod = 13; // svetodiod s 220 oma rezistor na pin 10
int pin = A0; // potenciometyr na analogov pin 0
int stojnost; // promenliva za otchitane
void setup () {
  Serial.begin(115200);
}
void loop (){
  stojnost = analogRead (pin); // zadava ‘stojnost’ ravna na ‘pin’
  Serial.println(stojnost);
  delay(1000);
  stojnost /= 4; // konvertira 0-1023 kym 0-255
  analogWrite (svetodiod, stojnost); // izprashta PWM signal kym
  // svetodiod
}
