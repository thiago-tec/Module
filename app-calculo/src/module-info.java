module app.calculo {
	
	requires transitive app.loggin;
	exports br.com.cod3r.app.calculo;
	
//	exports br.com.cod3r.app.calculo.interno to app.financeiro;
	
	opens br.com.cod3r.app.calculo to app.financeiro, app.loggin;
	
	requires app.api;
	provides br.com.cod3r.app.Calculadora 
	with br.com.cod3r.app.calculo.CalculadoraImpl;
	
}