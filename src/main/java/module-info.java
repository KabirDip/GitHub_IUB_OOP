module org.example.github_oop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.github_oop to javafx.fxml;
    exports org.example.github_oop;
}