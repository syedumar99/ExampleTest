import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponent } from './MyComponent';
import { ForEachComponent } from './for-each/for-each.component';
import {FormsModule} from '@angular/forms';
import { IfExampleComponent } from './if-example/if-example.component'
import {CustomDirective} from './CustomDirective'

@NgModule({
  declarations: [
    AppComponent, MyComponent, ForEachComponent, IfExampleComponent, CustomDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
