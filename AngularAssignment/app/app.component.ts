import { Component,OnInit } from '@angular/core';
import { MyComponent } from './MyComponent';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  ImagePath:string;
  age: number = 15;
  constructor() {
    //Image location
    this.ImagePath = 'https://images.theconversation.com/files/304864/original/file-20191203-67028-qfiw3k.jpeg?ixlib=rb-1.1.0&rect=638%2C2%2C795%2C745&q=20&auto=format&w=320&fit=clip&dpr=2&usm=12&cs=strip'
  }

ngOnInit() {

}

}