package vn.hust.edu.qlsv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student>{
    Context context;
    int layout;
    ArrayList<Student> arrayList;

    public StudentAdapter(Context context, int layout, ArrayList<Student> arrayList) {
        super(context, layout, arrayList);
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView= inflater.inflate(layout, null);

        TextView txtMssv= convertView.findViewById(R.id.mssv);
        TextView txtName= convertView.findViewById(R.id.name);
        TextView txtBirth= convertView.findViewById(R.id.birthday);
        TextView txtEmail= convertView.findViewById(R.id.email);
        TextView txtAddr= convertView.findViewById(R.id.address);
        ImageView avatar =convertView.findViewById(R.id.image);

        txtMssv.setText(arrayList.get(position).getMssv());
        txtName.setText(arrayList.get(position).getName());
        txtBirth.setText(arrayList.get(position).getBirthday());
        txtEmail.setText(arrayList.get(position).getEmail());
        txtAddr.setText(arrayList.get(position).getAddress());
        avatar.setImageResource(R.drawable.ic_person);
        return convertView;
    }
}
