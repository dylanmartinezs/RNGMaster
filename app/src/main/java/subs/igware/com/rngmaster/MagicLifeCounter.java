package subs.igware.com.rngmaster;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 *
 */
public class MagicLifeCounter extends Fragment {

    Button player1Plus1;
    Button player2Plus1;
    Button player1Plus10;
    Button player2Plus10;
    Button player1Minus1;
    Button player2Minus1;
    Button player1Minus10;
    Button player2Minus10;

    TextView player1Lives;
    TextView player2Lives;

    int livesOfPlayer1 = 20;
    int livesOfPlayer2 = 20;

    public MagicLifeCounter() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_magic_life_counter, container, false);;

        getActivity().setTitle("Magic Lives Counter");

        player1Lives = (TextView) view.findViewById(R.id.player1Lives);
        player2Lives = (TextView) view.findViewById(R.id.player2Lives);

        player1Plus1 = view.findViewById(R.id.player1Plus1);
        player1Plus10 = view.findViewById(R.id.player1Plus10);
        player2Plus1 = view.findViewById(R.id.player2Plus1);
        player2Plus10 = view.findViewById(R.id.player2Plus10);
        player1Minus1 = view.findViewById(R.id.player1Minus1);
        player2Minus1 = view.findViewById(R.id.player2Minus1);
        player1Minus10 = view.findViewById(R.id.player1Minus10);
        player2Minus10 = view.findViewById(R.id.player2Minus10);

        player1Plus1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer1 += 1;
                player1Lives.setText(String.valueOf(livesOfPlayer1));
            }
        });

        player1Plus10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer1 += 10;
                player1Lives.setText(String.valueOf(livesOfPlayer1));
            }
        });

        player1Minus1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer1 -= 1;
                player1Lives.setText(String.valueOf(livesOfPlayer1));
            }
        });

        player1Minus10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer1 -= 10;
                player1Lives.setText(String.valueOf(livesOfPlayer1));
            }
        });

        player2Plus1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer2 += 1;
                player2Lives.setText(String.valueOf(livesOfPlayer2));
            }
        });

        player2Plus10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer2 += 10;
                player2Lives.setText(String.valueOf(livesOfPlayer2));
            }
        });

        player2Minus1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer2 -= 1;
                player2Lives.setText(String.valueOf(livesOfPlayer2));
            }
        });

        player2Minus10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                livesOfPlayer2 -= 10;
                player2Lives.setText(String.valueOf(livesOfPlayer2));
            }
        });
        return view;
    }
}