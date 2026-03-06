/* we have a class called Student in a Java program. Each student has a name 
 * and an age. Now, imagine we want to add some additional information about 
 * each student, such as their grade level. Without custom annotations, we 
 * might handle this by adding fields directly to the Student class. However, 
 * this approach can become messy if we want to add more custom information 
 * in the future, or if we want to apply different behaviours to different fields.
 *
 * Here's how custom annotations can help:
 * 
 * 1. Define a custom annotation
 * 2. Apply the custom annotation to fields in the Student class
 * 3. Use reflection to access the annotation at runtime
 * 
 * At runtime, we can use reflection to access these annotations and perform 
 * actions based on them, providing flexibility and organization to our code.
 */
import java.lang.annotation.*;  
import java.lang.reflect.*;  
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface AdditionalInfo {
    String value();
}

public class CustomAnnotation2 {
    public static void main(String[] args) {
        Student socrates = new Student();
        Field[] fields = socrates.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(AdditionalInfo.class)) {
                AdditionalInfo annotation = field.getAnnotation(AdditionalInfo.class);
                System.out.println(field.getName() + ": " + annotation.value());
            }
        }
    }
}


class Student {
    private String name;
    private int age;

    @AdditionalInfo("First Year")
    private int yearOfStudy; // You see, the attribute 'yearOfStudy' remains unused (explicitly) throughout the entirety of the program

    // Constructor, getters, setters, etc.
}
