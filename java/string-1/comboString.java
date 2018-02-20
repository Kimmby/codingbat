public String comboString(String a, String b) { //Given string a and b.
  if (a.length() < b.length()){ //If string a is smaller than string b 
    return a + b + a;           //then output the smaller numbers on the outside.
  }
  else{                         // On the other hand if string b is bigger than string a
    return b + a + b;           // output b.
  }
}
