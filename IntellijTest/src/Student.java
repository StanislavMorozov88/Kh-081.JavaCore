public class Student {
    //input
    private String name;
    private float rating;


    private static int count = 0;
    private static float sumRating;
    private static float avrRating;


    public Student() {
        count++;
        sumRating += rating;
    }
    public Student(String name, float rating) {
        this.name = name;
        this.rating = rating;
        count++;
        sumRating += rating;
    }
    public static float avrRating(){
        return avrRating = sumRating / count;
    }

    public boolean betterStudent(Student s){
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        sumRating -=  this.rating;
        this.rating = rating;
        sumRating += rating;
    }

}
