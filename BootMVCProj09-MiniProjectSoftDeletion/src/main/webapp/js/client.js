function validation(frm){
	
	document.getElementById("enameErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	
	let ename=frm.ename.value
	let job=frm.job.value
	let sal=frm.sal.value
	frm.vflag.value="yes";
	if(ename==""){
		document.getElementById("enameErr").innerHTML="employee name is mandatory(cs)";
		flag=false;
	}
	else if(job.length>9){
			document.getElementById("enameErr").innerHTML="employee name must have max of 10 chars(cs)";
			flag=false;
		}
	if(job==""){
		document.getElementById("jobErr").innerHTML="employee job is required(cs)";
		flag=false;
	}
	else if(job.length>9){
		document.getElementById("jobErr").innerHTML="employee job can have max of 10 chars(cs)"
		flag=false;
	}
	if(sal==""){
		document.getElementById("salErr").innerHTML="employee sal is mandatory(cs)";
		flag=false;
	}
	else if(isNaN(sal)){
		document.getElementById("salErr").innerHTML="employee sal must be numeric value(cs)";
		flag=false;
	}
	else if(sal<0||sal>1000000){
		document.getElementById("salErr").innerHTML="employee sal must be in range 1 through 10000000(cs)";
		flag=false;
	}
	return flag;
	
	
}