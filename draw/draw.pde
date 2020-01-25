void setup(){
  size(1000,1000);
   background(0,0,0);
}
void draw(){
 fill(mouseY,mouseX,200);
 ellipse(mouseX,mouseY,50,50);
 triangle(20,40,40,20,60,50);
}
