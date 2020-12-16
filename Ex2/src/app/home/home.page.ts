import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  public edtPeso;
  public edtAltura;
  public imc;
  public resultado;
  public cor;

  constructor() {}
  onVerificarClick(): void{      
    this.imc=this.edtPeso/(this.edtAltura^2);
    if(this.imc <18,5){
      this.resultado="Você está abaixo do peso ideal";
      this.cor = "warning";
    }else if(this.imc>18,5 && this.imc<25){
      this.resultado="Parabéns, você está em seu peso normal!"
      this.cor = "success";
    }else if(this.imc>25 && this.imc<30){
      this.resultado="Você está acima do seu peso (sobrepeso)";
      this.cor = "warning";
    }else if(this.imc>30 && this.imc<35){
      this.resultado="Obesidade de grau 1";
      this.cor = "warning";
    }else if(this.imc>35 && this.imc<40){
      this.resultado="Obesidade de grau 2";
      this.cor = "danger";
    }else if(this.imc>40){
      this.resultado="Obesidade de grau 3";
      this.cor = "danger";
    }
  }
}
