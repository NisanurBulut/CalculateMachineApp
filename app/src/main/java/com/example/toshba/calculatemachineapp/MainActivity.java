package com.example.toshba.calculatemachineapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private float ilkDeger = 0;
    private double sonuc = 0;
    private String islem;
   public String myarray;
    Button btn_esit;
    TextView txtView;
    private static final String TAG = "myApp";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtView = (TextView) findViewById(R.id.txtCalculation);
        final Button btn_1 = (Button) findViewById(R.id.btn1);
        final Button btn_2 = (Button) findViewById(R.id.btn2);
        final Button btn_3 = (Button) findViewById(R.id.btn3);
        final Button btn_4 = (Button) findViewById(R.id.btn4);
        final Button btn_5 = (Button) findViewById(R.id.btn5);
        final Button btn_6 = (Button) findViewById(R.id.btn6);
        final Button btn_7 = (Button) findViewById(R.id.btn7);
        final Button btn_8 = (Button) findViewById(R.id.btn8);
        final Button btn_9 = (Button) findViewById(R.id.btn9);
        final Button btn_C = (Button) findViewById(R.id.btnC);
        final Button btn_top = (Button) findViewById(R.id.button_sum);
        final Button btn_carp = (Button) findViewById(R.id.button_X);

        final Button btn_bol = (Button) findViewById(R.id.btnbol);
        final Button btn_cikar = (Button) findViewById(R.id.button_ek);
        final Button btn_0 = (Button) findViewById(R.id.btn0);

        //şimdi butonların tıklanmasına gore butonların textlerını string elemana ktarmalı parse ettrmeli
btn_C.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
        txtView.setText("");
    }
});
        //buton1e tıklanmış ise degerını string değişken içerisine alındı içine kaydedelım
        btn_0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_0.getText();
                txtView.append(btn_0.getText());
            }
        });
        btn_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_1.getText();
                txtView.append(btn_1.getText());
            }
        });

        btn_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_2.getText();
                txtView.append(btn_2.getText());
            }
        });

       btn_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_3.getText();
                txtView.append(btn_3.getText());
            }
        });

        btn_4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_4.getText();
                txtView.append(btn_4.getText());
            }
        });
        btn_5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_5.getText();
                txtView.append(btn_5.getText());
            }
        });

        btn_6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_6.getText();
                txtView.append(btn_6.getText());
            }
        });

        btn_7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_7.getText();
                txtView.append(btn_7.getText());
            }
        });

        btn_8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myarray += btn_8.getText();
                txtView.append(btn_8.getText());
            }
        });

        btn_9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
             myarray += btn_9.getText();
                txtView.append(btn_9.getText());
            }
        });

        btn_top.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                   myarray += btn_top.getText();
                txtView.append(btn_top.getText());

                Toast.makeText(MainActivity.this, "Toplama İşlemi", Toast.LENGTH_SHORT).show();
            }
        });
        btn_cikar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                   myarray+=btn_cikar.getText();
                txtView.append(btn_cikar.getText());

                Toast.makeText(MainActivity.this, "Çıkarma İşlemi", Toast.LENGTH_SHORT).show();
            }
        });
        btn_bol.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                    myarray += btn_bol.getText();
                txtView.append(btn_bol.getText());

                Toast.makeText(MainActivity.this, "Bölme İşlemi", Toast.LENGTH_SHORT).show();
            }
        });

        btn_carp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                  myarray+=btn_carp.getText();
                txtView.append(btn_carp.getText());
                Toast.makeText(MainActivity.this, "Çarpma İşlemi", Toast.LENGTH_SHORT).show();
            }

        });


    }

    public void SplitParameters(View v) {
        int bas=0;
        txtView.setText("");
        int fazlalik=0;
        btn_esit = (Button) findViewById(R.id.button_eq);
        txtView = (TextView) findViewById(R.id.txtCalculation);
        char [] isaretler=new char[100];
        char []yardimci=new char[100];
        char[] number=new char[30];
        int nsayac=0;
        int lastindex=myarray.length();
        int sonislem=0;
        String sonuc2=null;
        String deger1 = null;
        String deger2=null;
        double sayi1=0;
        double sayi2=0;
        char[] number2=new char[25];
        //işaretleri bulmak için
        for(int i=0;i<myarray.length();i++)
        {
            if(myarray.charAt(i)=='/'||myarray.charAt(i)=='+'||myarray.charAt(i)=='X'||myarray.charAt(i)=='-')
            {
                 isaretler[i]='a';
            }
            else
            {
                isaretler[i]=myarray.charAt(i);
            }
        }
        //ilk çarpıyı yada bölmeyi bulmak için for döngüsü toplama işlemini de burda yapar
        for(int i=4;i<lastindex;i++)
        {
            if(isaretler[i]=='a'&& (myarray.charAt(i-fazlalik)=='X'||myarray.charAt(i-fazlalik)=='/'))
            {

                isaretler[i]='c';
                for(int k=i-1;k>3;k--)
                {

                    if(isaretler[k]!='a'&&k==4)
                    {
                        number[nsayac]=isaretler[k];
                        nsayac++;
                        isaretler[k]='c';
                        deger1=String.copyValueOf(number);
                        deger1=deger1.substring(0, nsayac);

                    }
                    else if(isaretler[k]!='a'&&k!=4)
                    {
                        number[nsayac]=isaretler[k];
                        nsayac++;
                        isaretler[k]='c';
                    }
                    else
                    {
                        deger1=String.copyValueOf(number);
                        deger1=deger1.substring(0, nsayac);
                        Log.i(TAG, "Break"+k);
                        break;
                    }
                }
                if(number.length>=2)
                {
                    deger1=new StringBuilder(deger1).reverse().toString();

                }
                nsayac=0;
                for(int j=i+1;j<lastindex;j++)
                {
                    if(isaretler[j]!='a'&&j==lastindex-1)
                    {
                        number2[nsayac]=isaretler[j];
                        nsayac=nsayac+1;
                        isaretler[j]='c';
                        deger2=String.copyValueOf(number2);
                        deger2=deger2.substring(0,nsayac);
                    }
                    else if(isaretler[j]!='a'&&lastindex-1!=j)
                    {
                        number2[nsayac]=isaretler[j];
                        nsayac=nsayac+1;
                        isaretler[j]='c';
                    }
                    else
                    {
                        deger2=String.copyValueOf(number2);
                        deger2=deger2.substring(0,nsayac);
                        Log.i(TAG, "Break"+j);

                        break;
                    }
                }
                nsayac=0;
                sayi1=Double.parseDouble(deger1);
                sayi2=Double.parseDouble(deger2);

                if(myarray.charAt(i-fazlalik)=='/')
                {
                    sonuc=sayi1/(double)sayi2;
                    Log.i(TAG, "Sonuç"+sonuc);
                }
                if(myarray.charAt(i-fazlalik)=='X')
                {
                    sonuc=sayi1*sayi2;
                    Log.i(TAG, "Sonuç"+sonuc);
                }
                sonuc2=String.valueOf(sonuc);
                //yeni char arraya atama

                for(int l=isaretler.length-1;l>=4;l--)
                {
                    if(isaretler[l]=='c')
                    {
                        bas=l;
                        nsayac++;
                    }
                }
                //islem sonrası yerine koyma işlemi
                Log.i(TAG,"Burdayiz");
                if(nsayac==sonuc2.length())
                {
                   for(int l=bas;l<lastindex;l++)
                   {
                       if(isaretler[l]=='c')
                       {
                           isaretler[l]=sonuc2.charAt(l-bas);
                       }
                   }
                }
                Log.i(TAG,"Burdayiz"+nsayac+"   "+sonuc2.length());
                if(nsayac<sonuc2.length())
                {
                    Log.i(TAG,"Burdayiz");
                    fazlalik=0;
                    int sayac=sonuc2.length();
                    yardimci=isaretler.clone();
                    for(int l=bas;l<isaretler.length;l++)
                    {
                        if(isaretler[l]!='c'&&sayac!=0)
                        {

                            isaretler[l]=sonuc2.charAt(l-bas);
                            sayac--;
                            fazlalik++;
                            lastindex++;
                        }
                        else if(isaretler[l]=='c'&&sayac!=0)
                        {
                            isaretler[l]=sonuc2.charAt(l-bas);
                            sayac--;
                        }
                        else if(isaretler[l]!='c'||sayac==0&&fazlalik!=0)
                        {
                            isaretler[l]=yardimci[l-fazlalik];
                        }

                    }
                }
                if(nsayac>sonuc2.length())
                {

                    int sayac=sonuc2.length();
                    for(int l=bas;l<isaretler.length;l++)
                    {
                        if(sayac==0&&isaretler[l]=='c')
                        {
                            isaretler[l]='0';

                        }
                        else if(sayac!=0&&isaretler[l]=='c')
                        {
                            isaretler[l]=sonuc2.charAt(l-bas);
                            sayac--;
                        }
                        else if(sayac==0&&isaretler[l]!='c')
                        {
                            break;
                        }
                    }
                }




                i=0;
                nsayac=0;
            }


        }
        //Toplama ve çıkarma işlemi için
        for(int i=4;i<lastindex;i++)
        {
            if(isaretler[i]=='a')
            {

                isaretler[i]='c';
                for(int k=i-1;k>3;k--)
                {

                    if(isaretler[k]!='a'&&k==4)
                    {
                        number[nsayac]=isaretler[k];
                        nsayac++;
                        isaretler[k]='c';
                        deger1=String.copyValueOf(number);
                        deger1=deger1.substring(0, nsayac);

                    }
                    else if(isaretler[k]!='a'&&k!=4)
                    {
                        number[nsayac]=isaretler[k];
                        nsayac++;
                        isaretler[k]='c';
                    }
                    else
                    {
                        deger1=String.copyValueOf(number);
                        deger1=deger1.substring(0, nsayac);
                        Log.i(TAG, "Break"+k);
                        break;
                    }
                }
                if(number.length>=2)
                {
                    deger1=new StringBuilder(deger1).reverse().toString();

                }
                nsayac=0;
                for(int j=i+1;j<lastindex;j++)
                {
                    if(isaretler[j]!='a'&&j==lastindex-1)
                    {
                        number2[nsayac]=isaretler[j];
                        nsayac=nsayac+1;
                        isaretler[j]='c';
                        deger2=String.copyValueOf(number2);
                        deger2=deger2.substring(0,nsayac);
                    }
                    else if(isaretler[j]!='a'&&lastindex-1!=j)
                    {
                        number2[nsayac]=isaretler[j];
                        nsayac=nsayac+1;
                        isaretler[j]='c';
                    }
                    else
                    {
                        deger2=String.copyValueOf(number2);
                        deger2=deger2.substring(0,nsayac);
                        Log.i(TAG, "Break"+j);

                        break;
                    }
                }
                nsayac=0;
                sayi1=Double.parseDouble(deger1);
                sayi2=Double.parseDouble(deger2);
                for(int l=sonislem+1;l<myarray.length();l++)
                {
                    if(myarray.charAt(l)=='+')
                    {
                        sonislem=l;
                        sonuc=sayi1+(double)sayi2;
                        Log.i(TAG, "Sonuç"+sonuc);
                        break;
                    }
                    if(myarray.charAt(l)=='-')
                    {
                        sonislem=l;
                        sonuc=sayi1-sayi2;
                        Log.i(TAG, "Sonuç"+sonuc);
                        break;
                    }
                }

                sonuc2=String.valueOf(sonuc);
                //yeni char arraya atama

                for(int l=isaretler.length-1;l>=4;l--)
                {
                    if(isaretler[l]=='c')
                    {
                        bas=l;
                        nsayac++;
                    }
                }
                //islem sonrası yerine koyma işlemi
                Log.i(TAG,"Burdayiz");
                if(nsayac==sonuc2.length())
                {
                    for(int l=bas;l<lastindex;l++)
                    {
                        if(isaretler[l]=='c')
                        {
                            isaretler[l]=sonuc2.charAt(l-bas);
                        }
                    }
                }
                Log.i(TAG,"Burdayiz"+nsayac+"   "+sonuc2.length());
                if(nsayac<sonuc2.length())
                {
                    Log.i(TAG,"Burdayiz");
                    fazlalik=0;
                    int sayac=sonuc2.length();
                    yardimci=isaretler.clone();
                    for(int l=bas;l<isaretler.length;l++)
                    {
                        if(isaretler[l]!='c'&&sayac!=0)
                        {
                            isaretler[l]=sonuc2.charAt(l-bas);
                            sayac--;
                            fazlalik++;
                            lastindex++;
                        }
                        else if(isaretler[l]=='c'&&sayac!=0)
                        {
                            isaretler[l]=sonuc2.charAt(l-bas);
                            sayac--;
                        }
                        else if(isaretler[l]!='c'||sayac==0&&fazlalik!=0)
                        {
                            isaretler[l]=yardimci[l-fazlalik];
                        }

                    }
                }
                if(nsayac>sonuc2.length())
                {

                    int sayac=sonuc2.length();
                    for(int l=bas;l<isaretler.length;l++)
                    {
                        if(sayac==0&&isaretler[l]=='c')
                        {
                            isaretler[l]='0';

                        }
                        else if(sayac!=0&&isaretler[l]=='c')
                        {
                            isaretler[l]=sonuc2.charAt(l-bas);
                            sayac--;
                        }
                        else if(sayac==0&&isaretler[l]!='c')
                        {
                            break;
                        }
                    }
                }




                i=0;
                nsayac=0;
            }


        }
        myarray=null;
        number=null;
        number2=null;
        isaretler=null;
        //string içerisine değerlerimi aldım ve eşittir butonu tıklandıgında bunların split edilip bu parametrelere uygun olarak
        txtView.append(String.valueOf(sonuc));
        Toast.makeText(MainActivity.this,String.valueOf(sonuc), Toast.LENGTH_SHORT).show();

        }




}


