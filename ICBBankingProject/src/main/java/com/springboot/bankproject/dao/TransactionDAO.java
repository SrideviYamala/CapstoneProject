package com.springboot.bankproject.dao;

import java.sql.SQLException;
import java.util.List;
import com.springboot.bankproject.model.Transaction;

public interface TransactionDAO {

		public List<Transaction> showAllTransactions(int branchCode) 
				throws SQLException;

		List<Transaction> showTransactionsByAccountNo(int accNo) throws SQLException;

}

