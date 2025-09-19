import module java.base; // Exports java.base, which includes java.base.Date
import module java.sql; // Exports java.sql, which includes java.sql.Date

void main() {
  // Date class is now ambiguous, since the compiler can't know which Date class to use.
  // Compiler would give 2 errors, saying Date class is ambiguous.
  // 1st for the constructor call "Date" and 2nd for the data type of the reference variable "date".
  Date date = new Date();
  System.out.println(date.toString());
}
