public class Student {
    private String name;
    private float rating;
    private static int count = 0;
    private static float sumRating;
    private static float avgRating;

    public Student() {
        ++count;
        sumRating += this.rating;
    }

    public Student(String name, float rating) {
        this.name = name;
        this.rating = rating;
        ++count;
        sumRating += rating;
    }

    public static float avgRating() {
        return avgRating = sumRating / (float) count;
    }

    public boolean betterStudent(Student s) {
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        sumRating -= this.rating;
        this.rating = rating;
        sumRating += rating;
    }
}
