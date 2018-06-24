#include <LiquidCrystal.h>
LiquidCrystal lcd(12,11,5,4,3,2);

void setup() {
  lcd.begin(16,2);

}

void loop() {
 lcd.print("Arduino");
 delay(3000);
 lcd.setCursor(2,1);
 lcd.print("LCD Tutorial");
 delay(3000);
 lcd.clear();

}
