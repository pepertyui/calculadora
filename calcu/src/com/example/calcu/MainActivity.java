package com.example.calcu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView tv1;
    boolean ini=false;
    String valor1="",valor2="",resultado="";
    int opc=0,x=0,y=0;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 =(TextView) findViewById(R.id.tv1);
	
	}
	public void igual(View view){
		
		valor2=tv1.getText().toString();
		tv1.setText("");
		
		switch(opc){
		case 1:
		
			x=Integer.parseInt(valor1);
			y=Integer.parseInt(valor2);
			
			int suma = x+y;
			resultado=String.valueOf(suma);
			tv1.setText("");
			tv1.setText(resultado);
			break;
		case 2:
			x=Integer.parseInt(valor1);
			y=Integer.parseInt(valor2);
			int resta = x-y;
			resultado=String.valueOf(resta);
			tv1.setText("");
			tv1.setText(resultado);
			break;
		case 3:
			x=Integer.parseInt(valor1);
			y=Integer.parseInt(valor2);
			int multiplicacion = x*y;
			resultado=String.valueOf(multiplicacion);
			tv1.setText("");
			tv1.setText(resultado);
			break;
		case 4:
			x=Integer.parseInt(valor1);
			y=Integer.parseInt(valor2);
			int divicion = x/y;
			resultado=String.valueOf(divicion);
			tv1.setText("");
			tv1.setText(resultado);
			break;
		}
		ini=false;
	}
	public void raiz(View view){
		valor1=tv1.getText().toString();
		x=Integer.parseInt(valor1);
		double  raiz = Math.sqrt(x);
		resultado = String.valueOf(raiz);
		tv1.setText("");
		tv1.setText(resultado);
	}
	public void ce(View view){
		ini=false;
	    valor1="";
	    valor2="";
	    resultado="";
	    opc=0;
	    x=0;
	    y=0;
	    tv1.setText("");
	    tv1.setText("0");
	}
	public void divicion(View view){
		valor1=tv1.getText().toString();
		tv1.setText("");
		opc=4;
	}
	public void multiplicacion(View view){
		valor1=tv1.getText().toString();
		tv1.setText("");
		opc=3;
	}
	public void resta(View view){
		valor1 =tv1.getText().toString();
		tv1.setText("");
		opc=2;
	}
	public void suma(View view){
		try{
			
		valor1=tv1.getText().toString();
		tv1.setText("");
		
		opc=1;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void boton9(View view){
		try{
		if(ini==false){
		tv1.setText("");
		tv1.setText("9");
		ini=true;
		}else if(ini==true){
			tv1.setText(tv1.getText()+"9");
		}
		}catch(Exception e){
			      
		   }
		   
	}
	public void boton8(View view){
		try{
		if(ini==false){
		tv1.setText("");	
		tv1.setText("8");
		ini=true;
		}else if(ini==true){
			tv1.setText(tv1.getText()+"8");
		}
		}catch(Exception e){
			      
		   }
		   
	}
	public void boton7(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("7");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"7");
			}
			}catch(Exception e){
				      
			   }
		   
	}
	public void boton6(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("6");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"6");
			}
			}catch(Exception e){
				      
			   }
		   
	}
	public void boton5(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("5");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"5");
			}
			}catch(Exception e){
				      
			   }
		   
	}
	public void boton4(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("4");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"4");
			}
			}catch(Exception e){
				      
			   }
		   
	}
	public void boton3(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("3");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"3");
			}
			}catch(Exception e){
				      
			   }
		   
	}
	public void boton2(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("2");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"2");
			}
			}catch(Exception e){
				      
			   }
	}
	public void boton1(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("1");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"1");
			}
			}catch(Exception e){
				      
			   }
		   
	}
	public void boton0(View view){
		try{
			if(ini==false){
			tv1.setText("");	
			tv1.setText("0");
			ini=true;
			}else if(ini==true){
				tv1.setText(tv1.getText()+"0");
			}
			}catch(Exception e){
				      
			   }
		   
	}
		
}
