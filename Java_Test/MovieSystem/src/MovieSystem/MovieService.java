package MovieSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieService {
      public static ArrayList<Movie> movies = new ArrayList<>();
      public static Scanner sc = new Scanner(System.in);

    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用电影管理系统");
        System.out.println("1.添加电影");
        System.out.println("2.删除电影");
        System.out.println("3.修改电影");
        System.out.println("4.查询电影");
        System.out.println("5.查看全部电影");
        System.out.println("6.退出系统");
        System.out.println("++++++++++++++++++++++++++++++++++：");
        while(true){
            System.out.println("请输入您的选择：");
            switch(sc.nextInt()){
                case 1:
                    addMovie();
                    break;
                case 2:
                    deleteMovie();
                    break;
                case 3:
                    updateMovie();
                    break;
                case 4:
                    queryMovie();
                    break;
                case 5:
                    showAllMovie();
                    break;
                case 6:
                    System.out.println("欢迎下次使用");
                    System.exit(0);
            }
        }



    }

    private static void showAllMovie() {
        if(movies.isEmpty()){
            System.out.println("电影库为空");
            return;
        }
        for(Movie m:movies){
            System.out.println(m);
        }
    }

    private static void updateMovie() {
        System.out.println("请输入要修改的电影名称：");
        if(movies.isEmpty()){
            System.out.println("电影库为空");
            return;
        }

        String name = sc.next();
        for (Movie m : movies) {
            if (m.getName().equals(name)) {
                System.out.println("请输入新的演员：");
                m.setActor(sc.next());
                System.out.println("请输入新的价格：");
                m.setPrice(sc.nextDouble());
                System.out.println("请输入新的评分：");
                m.setScore(sc.nextDouble());
                System.out.println("修改成功");
                return;
            }
            System.out.println("修改失败");
        }

    }

    private static void deleteMovie() {
        System.out.println("请输入要删除的电影名称：");
        String name = sc.next();
        for (Movie m : movies) {
            if (m.getName().equals(name)) {
                movies.remove(m);
                System.out.println("删除成功");
                return;

            }
            System.out.println("删除失败");
        }

    }

    private static void addMovie() {
            Movie movie = new Movie();
        System.out.println("请输入电影名称：");

        movie.setName(sc.next());
        System.out.println("请输入演员：");
        movie.setActor(sc.next());
        System.out.println("请输入价格：");
        movie.setPrice(sc.nextDouble());
        System.out.println("请输入评分：");
        movie.setScore(sc.nextDouble());
        movies.add(movie);
        System.out.println("添加成功");


    }
//查询某部电影
    private static void queryMovie() {
        System.out.println("请输入要查询的电影名称：");
        String name = sc.next();
        for(Movie m :movies){
            if(m.getName().equals(name)){
                System.out.println(m);
                return;
            }
            System.out.println("查询失败");
            return;
        }
    }

}
