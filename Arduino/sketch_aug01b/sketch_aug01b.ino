#include <IRremote.h>

int IRpin = 11;  // pin for the IR sensor
int LED = 13;    // LED pin  
IRrecv irrecv(IRpin);
decode_results results;

boolean LEDon = true; // initializing LEDon as true

void setup()
{
  Serial.begin(9600);
  irrecv.enableIRIn(); // Start the receiver
  pinMode(LED, OUTPUT);
}

void loop() 
{
   
  if (irrecv.decode(&results)) 
    {
      
      irrecv.resume();   // Receive the next value
    }
  
   if (results.value == 0)  // change zero to your IR remote button number
     {
       if (LEDon == true)   // is LEDon equal to true? 
         {
           LEDon = false;   
           digitalWrite(LED, HIGH);
           delay(100);      // keeps the transistion smooth
            
         }
         
        else
          {
            LEDon = true;
            digitalWrite(LED, LOW);
            delay(100);
            
          }
          
     }

}
