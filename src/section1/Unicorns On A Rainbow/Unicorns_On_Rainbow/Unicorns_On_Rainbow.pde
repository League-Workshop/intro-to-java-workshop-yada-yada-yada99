PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("rainbow.jpeg");
size(800, 600);
rainbow.resize(width,height);
unicorn = loadImage("unicorn.png");
}

void draw() {
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}
