
import {getFirstChar, myInstance as rabbit} from './string_module.js';
import {Apple} from './string_module.js';


console.log(getFirstChar('car'));
console.log(getFirstChar('pizza'));
console.log(getFirstChar('hamburger'));
console.log(getFirstChar('noodle'));
console.log(getFirstChar('ramen'));

rabbit.myMethod1();
rabbit.myMethod2();
rabbit.myMethod3();

const a1 = new Apple(1000, 8);
const a2 = new Apple(800, 12);

console.log(a1.toString());
console.log(a2.toString());