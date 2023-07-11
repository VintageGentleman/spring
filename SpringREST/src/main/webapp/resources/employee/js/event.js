const userDiv = document.getElementById('user');
const ajaxBtn1 = document.getElementById('ajax-btn1'); 
const ajaxBtn2 = document.getElementById('ajax-btn2'); 
const rollBtn = document.getElementById('roll'); 

const rollRequest = new XMLHttpRequest();
rollRequest.addEventListener('readystatechange', (e) => {
    if(e.target.readyState == 4) {
        // JSON으로 데이터 받아서 활용하기
        console.log(e.target.responseText);

		const empArr = JSON.parse(e.target.responseText);
        userDiv.innerHTML = '';
		empArr.forEach((emp) => {
            const emp_keys = [emp.employee_id, emp.first_name, emp.last_name, emp.email, emp.phone_number, emp.job_id, emp.salary, emp.manager_id, emp.department_id];

            for(let i = 0; i < emp_keys.length; ++i) {
                let newDiv = document.createElement('div');
                newDiv.className = 'main';
                let newContent = document.createTextNode(`${emp_keys[i]}`);
                newDiv.appendChild(newContent);
                userDiv.appendChild(newDiv);
            }

        });
		
        // XML로 데이터 받아서 활용해보기
        // const xmlDom = e.target.responseXML;
        // console.log(xmlDom);
        // const allItem = xmlDom.getElementsByTagName('item');
        // console.log('length:', allItem.length);
        // for(let i = 0; i < allItem.length; ++i) {
        // 	const first_name = allItem[i].getElementsByTagName('first_name')[0];
        //     console.log(`${i}번째 아이템 : ${first_name.textContent}`);
        // }
    }
});

rollBtn.addEventListener('click', (e) => {
    rollRequest.open('GET', '../employee/roll');
    rollRequest.send();
});

ajaxBtn2.addEventListener('click', (e) => {
    const xhttp = new XMLHttpRequest();
    xhttp.open('GET', '../restful/employee/json');
    xhttp.addEventListener('readystatechange', (e) => {
        if(xhttp.readyState == 4) {
            // 도착한 JSON 형식 문자열을 JavaScript Object로 변환하여 사용할 수 있다 
            console.log(xhttp.responseText);

            const emp = JSON.parse(xhttp.responseText);

            console.log(emp.first_name);
            console.log(emp.last_name);
            console.log(emp.salary);
        }
    });
    xhttp.send();
});

ajaxBtn1.addEventListener('click', (e) => {
    // AJAX(비동기 자바스크립트 XML) 요청 객체
    const xhttp = new XMLHttpRequest();

    // open(method, uri) : 요청을 어디에 어떤 방식으로 보낼지 설정한다
    xhttp.open('GET', '../restful/value1');

    // 요청에 대한 응답이 도착했을 때의 이벤트를 설정해야한다
    xhttp.addEventListener('readystatechange', (e) => {
        console.log(e.target === xhttp);
        console.log('readyState: ', e.target.readyState);
        console.log('responseText: ', e.target.responseText);
        userDiv.innerHTML = e.target.responseText;
    });

    xhttp.send();
});