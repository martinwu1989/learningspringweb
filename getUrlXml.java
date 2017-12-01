package com.nntel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getUrlXml
 */
@WebServlet("/getUrlXml")
public class getUrlXml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUrlXml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String AccNbr="804106273749";
		String SearchMonth="2017";
		String AcctMonth="";
		String ListFlag="";
		if(request.getParameter("AccNbr")!=null)
		{
			AccNbr=request.getParameter("AccNbr").trim().equals("")?AccNbr:request.getParameter("AccNbr").trim();
		}
		if(request.getParameter("SearchMonth")!=null)
		{
			SearchMonth=request.getParameter("SearchMonth").trim().equals("")?SearchMonth:request.getParameter("SearchMonth").trim();
		}
		if(request.getParameter("AcctMonth")!=null)
		{
			AcctMonth=request.getParameter("AcctMonth").trim().equals("")?AcctMonth:request.getParameter("AcctMonth").trim();
		}
		if(request.getParameter("ListFlag")!=null)
		{
			ListFlag=request.getParameter("ListFlag").trim().equals("")?ListFlag:request.getParameter("ListFlag").trim();
		}
		String url="http://134.192.232.13:47780/api/soap/NetService_WTBunusQry/1.0?access_token=ZTIyYjI3OGRhNTljNzEzM2NkM2Y2NGQxZjQ0MmU2YWU=";
		String param="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ "<soapenv:Body>"
				+ "<ns1:CrmServer soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns1=\"http://Server.CRM.services.NetService\">"
				+"<Request xsi:type=\"xsd:string\">"
				+"&lt;Root&gt;"
				+"&lt;Domain&gt;SMTS&lt;/Domain&gt;"
				+"&lt;Passwd&gt;123456&lt;/Passwd&gt;"
				+"&lt;SrvCode&gt;WTBunusQry&lt;/SrvCode&gt;"
				+"&lt;RespCode&gt;0000&lt;/RespCode&gt;"
				+"&lt;BureauCode&gt;1100&lt;/BureauCode&gt;"
				+ "&lt;Content&gt;"
				+ "&lt;WTBunusQry&gt;"
				+ "&lt;AccNbr&gt;"+AccNbr+"&lt;/AccNbr&gt;"
				+ "&lt;SearchMonth&gt;"+SearchMonth+"&lt;/SearchMonth&gt;"
				+ "&lt;AcctMonth&gt;"+AcctMonth+"&lt;/AcctMonth&gt;"
				+ "&lt;ListFlag&gt;"+ListFlag+"&lt;/ListFlag&gt;"
				+"&lt;/WTBunusQry&gt;"
				+ "&lt;/Content&gt;"
				+"&lt;/Root&gt;"
				+"</Request>"
				+"</ns1:CrmServer>"
				+ "</soapenv:Body>"
				+ "</soapenv:Envelope>";	

		try
		{
	        //服务的地址
	        URL wsUrl = new URL(url);
	        HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();
	        conn.setDoInput(true);
	        conn.setDoOutput(true);
	        conn.setRequestMethod("POST");
	        conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
	        OutputStream os = conn.getOutputStream();
	        //请求体
	        os.write(param.getBytes());
	        InputStream is = conn.getInputStream();
	        
	        byte[] b = new byte[1024];
	        int len = 0;
	        String s = "";
	        while((len = is.read(b)) != -1){
	            String ss = new String(b,0,len,"UTF-8");
	            s += ss;
	        }
	        System.out.println(s);
	        is.close();
	        os.close();
	        conn.disconnect();
	        response.setHeader("content-type","text/xml;charset=utf-8");
	        response.getOutputStream().write((s).getBytes("utf-8"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String AccNbr="804106273749";
		String SearchMonth="2017";
		String AcctMonth="";
		String ListFlag="";
		if(request.getParameter("AccNbr")!=null)
		{
			AccNbr=request.getParameter("AccNbr").trim().equals("")?AccNbr:request.getParameter("AccNbr").trim();
		}
		if(request.getParameter("SearchMonth")!=null)
		{
			SearchMonth=request.getParameter("SearchMonth").trim().equals("")?SearchMonth:request.getParameter("SearchMonth").trim();
		}
		if(request.getParameter("AcctMonth")!=null)
		{
			AcctMonth=request.getParameter("AcctMonth").trim().equals("")?AcctMonth:request.getParameter("AcctMonth").trim();
		}
		if(request.getParameter("ListFlag")!=null)
		{
			ListFlag=request.getParameter("ListFlag").trim().equals("")?ListFlag:request.getParameter("ListFlag").trim();
		}
		String url="http://134.192.232.13:47780/api/soap/NetService_WTBunusQry/1.0?access_token=ZTIyYjI3OGRhNTljNzEzM2NkM2Y2NGQxZjQ0MmU2YWU=";
		String param="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ "<soapenv:Body>"
				+ "<ns1:CrmServer soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns1=\"http://Server.CRM.services.NetService\">"
				+"<Request xsi:type=\"xsd:string\">"
				+"&lt;Root&gt;"
				+"&lt;Domain&gt;SMTS&lt;/Domain&gt;"
				+"&lt;Passwd&gt;123456&lt;/Passwd&gt;"
				+"&lt;SrvCode&gt;WTBunusQry&lt;/SrvCode&gt;"
				+"&lt;RespCode&gt;0000&lt;/RespCode&gt;"
				+"&lt;BureauCode&gt;1100&lt;/BureauCode&gt;"
				+ "&lt;Content&gt;"
				+ "&lt;WTBunusQry&gt;"
				+ "&lt;AccNbr&gt;"+AccNbr+"&lt;/AccNbr&gt;"
				+ "&lt;SearchMonth&gt;"+SearchMonth+"&lt;/SearchMonth&gt;"
				+ "&lt;AcctMonth&gt;"+AcctMonth+"&lt;/AcctMonth&gt;"
				+ "&lt;ListFlag&gt;"+ListFlag+"&lt;/ListFlag&gt;"
				+"&lt;/WTBunusQry&gt;"
				+ "&lt;/Content&gt;"
				+"&lt;/Root&gt;"
				+"</Request>"
				+"</ns1:CrmServer>"
				+ "</soapenv:Body>"
				+ "</soapenv:Envelope>";	

		try
		{
	        //服务的地址
	        URL wsUrl = new URL(url);
	        HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();
	        conn.setDoInput(true);
	        conn.setDoOutput(true);
	        conn.setRequestMethod("POST");
	        conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
	        OutputStream os = conn.getOutputStream();
	        //请求体
	        os.write(param.getBytes());
	        InputStream is = conn.getInputStream();
	        
	        byte[] b = new byte[1024];
	        int len = 0;
	        String s = "";
	        while((len = is.read(b)) != -1){
	            String ss = new String(b,0,len,"UTF-8");
	            s += ss;
	        }
	        System.out.println(s);
	        is.close();
	        os.close();
	        conn.disconnect();
	        response.setHeader("content-type","text/xml;charset=utf-8");
	        response.getOutputStream().write((s).getBytes("utf-8"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
