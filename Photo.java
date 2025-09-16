import java.util.Scanner;

public class Photo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of photographers
        sc.nextLine(); // consume leftover newline

        Photographer[] arr = new Photographer[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            String name = sc.nextLine();
            String specialization = sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine(); // consume leftover newline
            arr[i] = new Photographer(id, name, specialization, rating);
        }

        String searchSpecialization = sc.nextLine();

        // Call method 1
        int count = countPhotographersBySpecialization(arr, searchSpecialization);
        if (count > 0) {
            System.out.println("Number of photographers in " + searchSpecialization + ": " + count);
        } else {
            System.out.println("No photographers found for the given specialization.");
        }

        // Call method 2
        Photographer result = getSecondHighestRatedPhotographer(arr);
        if (result != null) {
            System.out.println("id-" + result.getId());
            System.out.println("name-" + result.getName());
            System.out.println("specialization-" + result.getSpecialization());
            System.out.println("rating-" + result.getRating());
        } else {
            System.out.println("Second highest rated photographer not available.");
        }

        sc.close();
    }

    // Method 1: Count photographers by specialization
    public static int countPhotographersBySpecialization(Photographer[] arr, String specialization) {
        int count = 0;
        for (Photographer p : arr) {
            if (p.getSpecialization().equalsIgnoreCase(specialization)) {
                count++;
            }
        }
        return count;
    }

    // Method 2: Get second highest rated photographer
    public static Photographer getSecondHighestRatedPhotographer(Photographer[] arr) {
        if (arr.length < 2) return null;

        double max = Double.MIN_VALUE;
        for (Photographer p : arr) {
            if (p.getRating() > max) {
                max = p.getRating();
            }
        }

        double secondMax = Double.MIN_VALUE;
        for (Photographer p : arr) {
            if (p.getRating() > secondMax && p.getRating() < max) {
                secondMax = p.getRating();
            }
        }

        if (secondMax == Double.MIN_VALUE) return null;

        for (Photographer p : arr) {
            if (p.getRating() == secondMax) {
                return p; // first one with second highest rating
            }
        }

        return null;
    }
}

// Photographer class
class Photographer {
    private int id;
    private String name;
    private String specialization;
    private double rating;

    public Photographer(int id, String name, String specialization, double rating) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}






int min=Integer.MAX_VALUE;
for(Photographer p:arr)
{
    if(P.getRating()<min)
    {
        min=p.getRating();
    }
}
int sec=Integer.MAX_VALUE;
for(Photographer p:arr)
{
    if(min<p.getRating() && p.getRating()<sec)
    sec=p.getRating()
}
if(sec=Integer.MAX_VALUE) return null;
for(Photographer p:arr)
{
    if(sec==p.getRating())
    return p;
}
return null;