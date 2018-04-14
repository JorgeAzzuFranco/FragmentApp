package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.rafaj.fragmentapp.Planeta;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text;
    ImageView imgPlaneta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text = view.findViewById(R.id.textId);
        imgPlaneta = view.findViewById(R.id.imagenPlanet);
        Bundle bundle = this.getArguments();


        if(bundle != null){
            //Emergente de el fragmento actual
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            text.setText(bundle.getString("KEY"));

            switch (text.getText().toString()){
                case "Sun":
                    imgPlaneta.setImageResource(R.drawable.sol);
                    break;
                case "Mercury":
                    imgPlaneta.setImageResource(R.drawable.mercurio);
                    break;
                case "Venus":
                    imgPlaneta.setImageResource(R.drawable.venus);
                    break;
                case "Earth":
                    imgPlaneta.setImageResource(R.drawable.tierra);
                    break;
                case "Mars":
                    imgPlaneta.setImageResource(R.drawable.marte);
                    break;
                case "Jupiter":
                    imgPlaneta.setImageResource(R.drawable.jupiter);
                    break;
                case "Saturn":
                    imgPlaneta.setImageResource(R.drawable.saturn);
                    break;
                case "Uranus":
                    imgPlaneta.setImageResource(R.drawable.urano);
                    break;
                case "Neptune":
                    imgPlaneta.setImageResource(R.drawable.neptuno);
                    break;

            }
        }

        return view;
    }


}
