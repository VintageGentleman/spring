// 첫 번째 글자를 꺼내주는 함수
function getFirstChar(text) {
    return text[0];
}

function MyClass() {
    this.myMethod1 = () => {
        console.log(' /)/)');
        console.log('(  ..)');
        console.log('(  >$)');
    }    
    this.myMethod2 = () => {
        console.log(' /)/)');
        console.log('(  ..)');
        console.log('(  >☆)');
    }    
    this.myMethod3 = () => {
        console.log(' /)/)');
        console.log('(  ..)');
        console.log('(  >♡)');
    }    
}

const myInstance = new MyClass();

function Apple(price, sweet) {
    this.price = price;
    this.sweet = sweet;
	
    this.toString = () => {
        return `${price}won/${sweet}`;
    };
};

export {getFirstChar, myInstance, Apple};