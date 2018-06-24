
// constants won't change. They're used here to
// set pin numbers:
const int buttonPin = 12;   

const int carGreen = 3;
const int carYellow = 4;     
const int carRed = 5;

const int pedestrianGreen = 7;
const int pedestrianRed = 8;


int buttonState;             // the current reading from the input pin
int lastButtonState = LOW;   // the previous reading from the input pin

// the following variables are unsigned long's because the time, measured in miliseconds,
// will quickly become a bigger number than can be stored in an int.
unsigned long lastDebounceTime = 0;  // the last time the output pin was toggled
unsigned long debounceDelay = 50;    // the debounce time; increase if the output flickers

void setup() {
  pinMode(buttonPin, INPUT);
  pinMode(carGreen, OUTPUT);
  pinMode(carYellow, OUTPUT);
  pinMode(carRed, OUTPUT);
  pinMode(pedestrianGreen, OUTPUT);
  pinMode(pedestrianRed,OUTPUT);

  
}

void carStop(void){
  delay(3000);
  digitalWrite(carGreen, LOW);
  for(int i = 0; i <= 5; i++){
    digitalWrite(carYellow,HIGH);
    delay(500);
    digitalWrite(carYellow,LOW);
  }
  digitalWrite(carRed,HIGH);
}

void pedestrianGo(void){
  digitalWrite(pedestrianRed,LOW);
  digitalWrite(pedestrianGreen,HIGH);
  delay(10000);
  digitalWrite(pedestrianGreen,LOW);
  digitalWrite(pedestrianRed,HIGH);
}

void loop() {
  digitalWrite(carGreen,HIGH);
  digitalWrite(pedestrianRed,HIGH);
  // read the state of the switch into a local variable:
  int reading = digitalRead(buttonPin);

  // check to see if you just pressed the button
  // (i.e. the input went from LOW to HIGH),  and you've waited
  // long enough since the last press to ignore any noise:

  // If the switch changed, due to noise or pressing:
  if (reading != lastButtonState) {
    // reset the debouncing timer
    lastDebounceTime = millis();
  }

  if ((millis() - lastDebounceTime) > debounceDelay) {
    // whatever the reading is at, it's been there for longer
    // than the debounce delay, so take it as the actual current state:

    // if the button state has changed:
    if (reading != buttonState) {
      buttonState = reading;

      // only toggle the LED if the new button state is HIGH
      if (buttonState == HIGH) {
         carStop();
         pedestrianGo();
      }
    }
  }

  // save the reading.  Next time through the loop,
  // it'll be the lastButtonState:
  lastButtonState = reading;
}
