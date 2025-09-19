void main() {
  int iAmAPrimitiveOfTypeInt = 3;
  test(iAmAPrimitiveOfTypeInt);
  String notAnInt = "I am not a primitive of type int";
  test(notAnInt);
}

void test(Object obj) {
  if(obj instanceof int i) {
    System.out.println("It's an int: " + i);
  }
}
