
int array[];
color colors[];
int random;
void setup() {
  size(500, 500);
  array = new int[width];
  colors = new color[width];
  randomizer();
}  
void draw() {
  background(0);
  for (int i = 0; i < array.length; i++) { 
    fill(colors[i]);
    rect(i,0, 1, array[i]);
  }
  stepSort(array);
  if (mousePressed) {
    randomizer();
  }
}

void randomizer() {
  for (int i = 0; i < array.length; i++) {
    array[i] = (int)random(height); 
    colors[i] = (int)random(Integer.MAX_VALUE);
    noStroke();
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}