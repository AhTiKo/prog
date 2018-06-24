int svetodiod = 13; // svetodiod s 220 oma rezistor na pin 10
int pin = 0; // potenciometyr na analogov pin 0
int stojnost; // promenliva za otchitane
void setup () {
  Serial.begin(9600);  
  pinMode(svetodiod, OUTPUT);
}
void loop ()
{
  stojnost = analogRead (pin); // zadava ‘stojnost’ ravna na ‘pin’
  Serial.println(stojnost);
  digitalWrite(svetodiod,HIGH);
  delay(1024 - stojnost);
  digitalWrite(svetodiod,LOW);
  delay(1024 - stojnost);
//  stojnost /= 4; // konvertira 0-1023 kym 0-255
//  analogWrite (svetodiod, stojnost); // izprashta PWM signal kym
// svetodiod

  
}
