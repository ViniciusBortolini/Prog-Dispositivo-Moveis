import { Component } from '@angular/core';
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  public edtHrsTrabalhadas;
  public edtValorHr;
  public rbDesconto;
  public bruto;
  public liquido;
  public desconto;

  constructor() {}
  onVerificarClick(): void{
    this.bruto=this.edtValorHr*this.edtHrsTrabalhadas;
    this.desconto=this.bruto*this.rbDesconto/100;
    this.liquido=this.bruto-this.desconto;
   
  }


}
