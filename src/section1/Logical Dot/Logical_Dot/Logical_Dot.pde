

void setup() {
  size(600,600);
}

void draw() {
 
  if (mousePressed) {
        // fill with one color here
        fill(#B2090F);
        ellipse(mouseX,mouseY,50,50);
} else {
        // fill with a different color here
        fill(#38B209);
        ellipse(mouseX,mouseY,50,50);
}
}
