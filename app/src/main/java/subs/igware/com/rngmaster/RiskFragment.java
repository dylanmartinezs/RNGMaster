package subs.igware.com.rngmaster;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RiskFragment extends Fragment {
    Button fightBtn;
    EditText p1ej;
    EditText p2ej;
    TextView winner;
    TextView p1points;
    TextView p2points;
    int p1 = 0,p2 = 0;
    String s1, s2;

    public RiskFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_risk, container, false);
        View view = inflater.inflate(R.layout.fragment_risk, container, false);

        getActivity().setTitle("Risk Combat Calculator");

        fightBtn = (Button) view.findViewById(R.id.fightBtn);
        p1ej = (EditText) view.findViewById(R.id.p1Armies);
        p2ej = (EditText) view.findViewById(R.id.p2Armies);

        winner = (TextView) view.findViewById(R.id.riskWinner);
        p1points = (TextView) view.findViewById(R.id.player1TotalPoints);
        p2points = (TextView) view.findViewById(R.id.player2TotalPoints);

        fightBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                try
                {
                    s1 = p1ej.getText().toString();
                    s2 = p2ej.getText().toString();
                }
                catch(Exception e)
                {
                    Toast.makeText(getActivity(), "Please input valid data", Toast.LENGTH_SHORT).show();
                }

                try
                {
                    p1 = Integer.parseInt(s1);
                    p2 = Integer.parseInt(s2);
                }
                catch(Exception e)
                {
                    Toast.makeText(getActivity(), "Please input valid data", Toast.LENGTH_SHORT).show();
                }
                int totalp1, totalp2;
                totalp1 = calcCombat(p1);
                totalp2 = calcCombat(p2);

                if(totalp1 > totalp2)
                {
                    winner.setText("Player 1");
                }
                else if (totalp1 == totalp2)
                {
                    winner.setText("Draw");
                }
                else
                {
                    winner.setText("Player 2");
                }
                p1points.setText(String.valueOf(totalp1));
                p2points.setText(String.valueOf(totalp2));
            }
        });

    return view;
    }

    public static int calcCombat(int i)
    {
        int b = 0;
        double rng;
        for(int a = 1; a <= i; a++)
        {
            rng = Math.random()*6+1;
            b += (int) rng;
        }
        return b;
    }

}
