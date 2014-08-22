package ru.komeco.ecolite;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


class Waste {
	private String  fkko, name, proizvodstvo, process;
	private Integer klop;
	
	Waste(String fkko, String name, String proizvodstvo, String process, 
			Integer klop){
		this.setFkko(fkko);
		this.setName(name);
		this.setProizvodstvo(proizvodstvo);
		this.setProcess(process);
		this.setKlop(klop);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getProizvodstvo() {
		return proizvodstvo;
	}

	private void setProizvodstvo(String proizvodstvo) {
		this.proizvodstvo = proizvodstvo;
	}

	public String getProcess() {
		return process;
	}

	private void setProcess(String process) {
		this.process = process;
	}

	public Integer getKlop() {
		return klop;
	}

	private void setKlop(Integer klop) {
		this.klop = klop;
	}

	public String getFkko() {
		return fkko;
	}

	private void setFkko(String fkko) {
		this.fkko = fkko;
	}

}

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_main);
        
        final Button button = (Button) findViewById(R.id.button_main);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) // клик на кнопку
            {
            	Waste waste=new Waste("1 11 110 01 23 5", 
            			"мякина", 
            			"выращивание зерновых и зернобобовых культур", 
            			"уборка урожая зерновых и зернобобовых культур", 
            			5);
            	
            	final EditText mFullDescFKKO = (EditText)findViewById(R.id.editText1);

            	mFullDescFKKO.append(waste.getFkko()+"\n" );
            	mFullDescFKKO.append(waste.getName()+"\n");
            	mFullDescFKKO.append(waste.getProizvodstvo()+"\n");
            	mFullDescFKKO.append(waste.getProcess()+"\n");
            	mFullDescFKKO.append(waste.getKlop().toString());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
