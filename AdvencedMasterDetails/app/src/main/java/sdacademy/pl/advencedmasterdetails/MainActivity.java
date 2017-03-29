package sdacademy.pl.advencedmasterdetails;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import sdacademy.pl.advencedmasterdetails.CurrencyCalculatorFragment;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Podmiana fragmentów
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrame, new CurrencyCalculatorFragment());
        transaction.commit();
    }
}
