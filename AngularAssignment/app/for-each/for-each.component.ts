import { Component, OnInit } from '@angular/core';
import { hero } from '../Hero';

@Component({
  selector: 'app-for-each',
  templateUrl: './for-each.component.html',
  styleUrls: ['./for-each.component.css']
})
export class ForEachComponent implements OnInit {
  heroes = ['Salman khan', 'Akshay Kumar', 'Allu Arjun', 'Rajnikanth'];
  constructor() { }

  data = [
    new hero(123, "Umar"),
    new hero(420, "Thouheed")
  ]
  ngOnInit(): void {
  }

}
