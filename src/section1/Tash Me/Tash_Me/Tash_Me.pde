PImage mustache;
PImage epic;
void setup() {
epic = loadImage("epic.png");
size(800, 600);
epic.resize(width,height);
mustache = loadImage("mustache.png");
mustache.resize(200,200);

}

void draw() {
background(epic);
image(mustache, mouseX, mouseY);
}
