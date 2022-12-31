package com.ledzer.invoice.command.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvoiceDetailsCommandDTO {

	private String id;
	private String hsnCode;
	private String invoiceId;
	private String productId;
	private String rate;
	private String quantity;
	private String taxableAmount;
	private String gst;
	private String gstAmt;
	private String sgstPer;
	private String sgstAmt;
	private String cgstPer;
	private String cgstAmt;
	private String igstPer;
	private String igstAmt;
}
