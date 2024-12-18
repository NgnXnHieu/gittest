package com.websiteshop.model;

import java.io.Serializable;
import java.util.List;

import com.websiteshop.entity.Account;
import com.websiteshop.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long commentId;
	private Account account;
	private Product product;
	private String description;
	private Boolean isEdit;

}
