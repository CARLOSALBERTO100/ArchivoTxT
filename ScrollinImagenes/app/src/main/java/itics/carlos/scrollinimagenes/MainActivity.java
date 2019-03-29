package itics.carlos.scrollinimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public Category(String categoryId, String tittle, String description, Drawable imagen) {
        super();
        this.tittle = tittle;
        this.description = description;
        this.imagen = imagen;
        this.categoryId = categoryId;
    }
}
