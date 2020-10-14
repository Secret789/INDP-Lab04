package com.example.indp_lab04;

import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;
        import java.util.ArrayList;

public class AdapterList extends BaseAdapter {
    private Context context;
    private int layout;
    public ArrayList<Estudiante> estudiantes;

    public AdapterList(Context context, int layout, ArrayList<Estudiante> estudiantes) {
        this.context = context;
        this.layout = layout;
        this.estudiantes = estudiantes;
    }
    @Override
    public int getCount() {
        return this.estudiantes.size();
    }
    @Override
    public Object getItem(int position) {
        return this.estudiantes.get(position);
    }
    @Override
    public long getItemId(int id) {
        return id;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        // Copiamos la vista
        View v = convertView;
        //Inflamos la vista con nuestro propio layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.custom_text_list, null);
        // Valor actual según la posición

        String text = estudiantes.get(position).nombres+" "+estudiantes.get(position).apellidos;
        String subtext = Integer.toString(estudiantes.get(position).cui);

         // Referenciamos el elemento a modificar y lo rellenamos
        TextView textView = (TextView) v.findViewById(R.id.txtMsg);
        textView.setText(text);
        TextView textView2 = (TextView) v.findViewById(R.id.txtMsg2);
        textView2.setText(subtext);
         //Devolvemos la vista inflada
        return v;
    }
}