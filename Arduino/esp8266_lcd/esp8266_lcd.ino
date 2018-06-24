#include <LiquidCrystal.h>
LiquidCrystal lcd(5,4,3,2,1,0);
void setup() {
  lcd.begin(16,2);
}

void loop() {
  lcd.print("ESP8266");
 delay(3000);
 lcd.setCursor(2,1);
 lcd.print("LCD Tutorial");
 delay(3000);
 lcd.clear();

}
