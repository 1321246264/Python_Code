// ORM class for table 't50_transaction'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 09 14:02:20 CST 2020
// For connector: com.cloudera.connector.teradata.TeradataManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class t50_transaction extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Tx_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_ID = (String)value;
      }
    });
    setters.put("Tx_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Tx_Tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_Tm = (java.sql.Timestamp)value;
      }
    });
    setters.put("Tx_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_Type_Cd = (String)value;
      }
    });
    setters.put("Tx_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_Cd = (String)value;
      }
    });
    setters.put("Tx_Sub_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_Sub_Cd = (String)value;
      }
    });
    setters.put("Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Station_ID = (String)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Line_ID = (String)value;
      }
    });
    setters.put("Opr_Pty_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Opr_Pty_ID = (String)value;
      }
    });
    setters.put("Tkt_Provi_Pty_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tkt_Provi_Pty_ID = (String)value;
      }
    });
    setters.put("Ticket_Card_Type_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Ticket_Card_Type_Cd = (String)value;
      }
    });
    setters.put("Prod_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Prod_ID = (String)value;
      }
    });
    setters.put("Prod_Group_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Prod_Group_ID = (String)value;
      }
    });
    setters.put("Tkt_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tkt_ID = (String)value;
      }
    });
    setters.put("Tkt_Seq_Num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tkt_Seq_Num = (String)value;
      }
    });
    setters.put("Tkt_Life_Prd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tkt_Life_Prd = (Integer)value;
      }
    });
    setters.put("Ptn_Tx_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Ptn_Tx_Ind = (Integer)value;
      }
    });
    setters.put("Src_Prtcptr_Pty_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Src_Prtcptr_Pty_ID = (String)value;
      }
    });
    setters.put("Equip_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Equip_ID = (String)value;
      }
    });
    setters.put("Tx_Status_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Tx_Status_Ind = (Integer)value;
      }
    });
    setters.put("Stl_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Stl_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Check_Entry_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Check_Entry_Dt = (java.sql.Date)value;
      }
    });
    setters.put("CCH_Irgul_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.CCH_Irgul_Ind = (Integer)value;
      }
    });
    setters.put("CCH_Irgul_List", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.CCH_Irgul_List = (String)value;
      }
    });
    setters.put("DDT_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.DDT_Ind = (Integer)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("City_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.City_Cd = (String)value;
      }
    });
    setters.put("Industry_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Industry_Cd = (String)value;
      }
    });
    setters.put("Data_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Data_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Pay_Mode_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        t50_transaction.this.Pay_Mode_Cd = (String)value;
      }
    });
  }
  public t50_transaction() {
    init0();
  }
  private String Tx_ID;
  public String get_Tx_ID() {
    return Tx_ID;
  }
  public void set_Tx_ID(String Tx_ID) {
    this.Tx_ID = Tx_ID;
  }
  public t50_transaction with_Tx_ID(String Tx_ID) {
    this.Tx_ID = Tx_ID;
    return this;
  }
  private java.sql.Date Tx_Dt;
  public java.sql.Date get_Tx_Dt() {
    return Tx_Dt;
  }
  public void set_Tx_Dt(java.sql.Date Tx_Dt) {
    this.Tx_Dt = Tx_Dt;
  }
  public t50_transaction with_Tx_Dt(java.sql.Date Tx_Dt) {
    this.Tx_Dt = Tx_Dt;
    return this;
  }
  private java.sql.Timestamp Tx_Tm;
  public java.sql.Timestamp get_Tx_Tm() {
    return Tx_Tm;
  }
  public void set_Tx_Tm(java.sql.Timestamp Tx_Tm) {
    this.Tx_Tm = Tx_Tm;
  }
  public t50_transaction with_Tx_Tm(java.sql.Timestamp Tx_Tm) {
    this.Tx_Tm = Tx_Tm;
    return this;
  }
  private String Tx_Type_Cd;
  public String get_Tx_Type_Cd() {
    return Tx_Type_Cd;
  }
  public void set_Tx_Type_Cd(String Tx_Type_Cd) {
    this.Tx_Type_Cd = Tx_Type_Cd;
  }
  public t50_transaction with_Tx_Type_Cd(String Tx_Type_Cd) {
    this.Tx_Type_Cd = Tx_Type_Cd;
    return this;
  }
  private String Tx_Cd;
  public String get_Tx_Cd() {
    return Tx_Cd;
  }
  public void set_Tx_Cd(String Tx_Cd) {
    this.Tx_Cd = Tx_Cd;
  }
  public t50_transaction with_Tx_Cd(String Tx_Cd) {
    this.Tx_Cd = Tx_Cd;
    return this;
  }
  private String Tx_Sub_Cd;
  public String get_Tx_Sub_Cd() {
    return Tx_Sub_Cd;
  }
  public void set_Tx_Sub_Cd(String Tx_Sub_Cd) {
    this.Tx_Sub_Cd = Tx_Sub_Cd;
  }
  public t50_transaction with_Tx_Sub_Cd(String Tx_Sub_Cd) {
    this.Tx_Sub_Cd = Tx_Sub_Cd;
    return this;
  }
  private String Station_ID;
  public String get_Station_ID() {
    return Station_ID;
  }
  public void set_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
  }
  public t50_transaction with_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public t50_transaction with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Opr_Pty_ID;
  public String get_Opr_Pty_ID() {
    return Opr_Pty_ID;
  }
  public void set_Opr_Pty_ID(String Opr_Pty_ID) {
    this.Opr_Pty_ID = Opr_Pty_ID;
  }
  public t50_transaction with_Opr_Pty_ID(String Opr_Pty_ID) {
    this.Opr_Pty_ID = Opr_Pty_ID;
    return this;
  }
  private String Tkt_Provi_Pty_ID;
  public String get_Tkt_Provi_Pty_ID() {
    return Tkt_Provi_Pty_ID;
  }
  public void set_Tkt_Provi_Pty_ID(String Tkt_Provi_Pty_ID) {
    this.Tkt_Provi_Pty_ID = Tkt_Provi_Pty_ID;
  }
  public t50_transaction with_Tkt_Provi_Pty_ID(String Tkt_Provi_Pty_ID) {
    this.Tkt_Provi_Pty_ID = Tkt_Provi_Pty_ID;
    return this;
  }
  private String Ticket_Card_Type_Cd;
  public String get_Ticket_Card_Type_Cd() {
    return Ticket_Card_Type_Cd;
  }
  public void set_Ticket_Card_Type_Cd(String Ticket_Card_Type_Cd) {
    this.Ticket_Card_Type_Cd = Ticket_Card_Type_Cd;
  }
  public t50_transaction with_Ticket_Card_Type_Cd(String Ticket_Card_Type_Cd) {
    this.Ticket_Card_Type_Cd = Ticket_Card_Type_Cd;
    return this;
  }
  private String Prod_ID;
  public String get_Prod_ID() {
    return Prod_ID;
  }
  public void set_Prod_ID(String Prod_ID) {
    this.Prod_ID = Prod_ID;
  }
  public t50_transaction with_Prod_ID(String Prod_ID) {
    this.Prod_ID = Prod_ID;
    return this;
  }
  private String Prod_Group_ID;
  public String get_Prod_Group_ID() {
    return Prod_Group_ID;
  }
  public void set_Prod_Group_ID(String Prod_Group_ID) {
    this.Prod_Group_ID = Prod_Group_ID;
  }
  public t50_transaction with_Prod_Group_ID(String Prod_Group_ID) {
    this.Prod_Group_ID = Prod_Group_ID;
    return this;
  }
  private String Tkt_ID;
  public String get_Tkt_ID() {
    return Tkt_ID;
  }
  public void set_Tkt_ID(String Tkt_ID) {
    this.Tkt_ID = Tkt_ID;
  }
  public t50_transaction with_Tkt_ID(String Tkt_ID) {
    this.Tkt_ID = Tkt_ID;
    return this;
  }
  private String Tkt_Seq_Num;
  public String get_Tkt_Seq_Num() {
    return Tkt_Seq_Num;
  }
  public void set_Tkt_Seq_Num(String Tkt_Seq_Num) {
    this.Tkt_Seq_Num = Tkt_Seq_Num;
  }
  public t50_transaction with_Tkt_Seq_Num(String Tkt_Seq_Num) {
    this.Tkt_Seq_Num = Tkt_Seq_Num;
    return this;
  }
  private Integer Tkt_Life_Prd;
  public Integer get_Tkt_Life_Prd() {
    return Tkt_Life_Prd;
  }
  public void set_Tkt_Life_Prd(Integer Tkt_Life_Prd) {
    this.Tkt_Life_Prd = Tkt_Life_Prd;
  }
  public t50_transaction with_Tkt_Life_Prd(Integer Tkt_Life_Prd) {
    this.Tkt_Life_Prd = Tkt_Life_Prd;
    return this;
  }
  private Integer Ptn_Tx_Ind;
  public Integer get_Ptn_Tx_Ind() {
    return Ptn_Tx_Ind;
  }
  public void set_Ptn_Tx_Ind(Integer Ptn_Tx_Ind) {
    this.Ptn_Tx_Ind = Ptn_Tx_Ind;
  }
  public t50_transaction with_Ptn_Tx_Ind(Integer Ptn_Tx_Ind) {
    this.Ptn_Tx_Ind = Ptn_Tx_Ind;
    return this;
  }
  private String Src_Prtcptr_Pty_ID;
  public String get_Src_Prtcptr_Pty_ID() {
    return Src_Prtcptr_Pty_ID;
  }
  public void set_Src_Prtcptr_Pty_ID(String Src_Prtcptr_Pty_ID) {
    this.Src_Prtcptr_Pty_ID = Src_Prtcptr_Pty_ID;
  }
  public t50_transaction with_Src_Prtcptr_Pty_ID(String Src_Prtcptr_Pty_ID) {
    this.Src_Prtcptr_Pty_ID = Src_Prtcptr_Pty_ID;
    return this;
  }
  private String Equip_ID;
  public String get_Equip_ID() {
    return Equip_ID;
  }
  public void set_Equip_ID(String Equip_ID) {
    this.Equip_ID = Equip_ID;
  }
  public t50_transaction with_Equip_ID(String Equip_ID) {
    this.Equip_ID = Equip_ID;
    return this;
  }
  private Integer Tx_Status_Ind;
  public Integer get_Tx_Status_Ind() {
    return Tx_Status_Ind;
  }
  public void set_Tx_Status_Ind(Integer Tx_Status_Ind) {
    this.Tx_Status_Ind = Tx_Status_Ind;
  }
  public t50_transaction with_Tx_Status_Ind(Integer Tx_Status_Ind) {
    this.Tx_Status_Ind = Tx_Status_Ind;
    return this;
  }
  private java.sql.Date Stl_Dt;
  public java.sql.Date get_Stl_Dt() {
    return Stl_Dt;
  }
  public void set_Stl_Dt(java.sql.Date Stl_Dt) {
    this.Stl_Dt = Stl_Dt;
  }
  public t50_transaction with_Stl_Dt(java.sql.Date Stl_Dt) {
    this.Stl_Dt = Stl_Dt;
    return this;
  }
  private java.sql.Date Check_Entry_Dt;
  public java.sql.Date get_Check_Entry_Dt() {
    return Check_Entry_Dt;
  }
  public void set_Check_Entry_Dt(java.sql.Date Check_Entry_Dt) {
    this.Check_Entry_Dt = Check_Entry_Dt;
  }
  public t50_transaction with_Check_Entry_Dt(java.sql.Date Check_Entry_Dt) {
    this.Check_Entry_Dt = Check_Entry_Dt;
    return this;
  }
  private Integer CCH_Irgul_Ind;
  public Integer get_CCH_Irgul_Ind() {
    return CCH_Irgul_Ind;
  }
  public void set_CCH_Irgul_Ind(Integer CCH_Irgul_Ind) {
    this.CCH_Irgul_Ind = CCH_Irgul_Ind;
  }
  public t50_transaction with_CCH_Irgul_Ind(Integer CCH_Irgul_Ind) {
    this.CCH_Irgul_Ind = CCH_Irgul_Ind;
    return this;
  }
  private String CCH_Irgul_List;
  public String get_CCH_Irgul_List() {
    return CCH_Irgul_List;
  }
  public void set_CCH_Irgul_List(String CCH_Irgul_List) {
    this.CCH_Irgul_List = CCH_Irgul_List;
  }
  public t50_transaction with_CCH_Irgul_List(String CCH_Irgul_List) {
    this.CCH_Irgul_List = CCH_Irgul_List;
    return this;
  }
  private Integer DDT_Ind;
  public Integer get_DDT_Ind() {
    return DDT_Ind;
  }
  public void set_DDT_Ind(Integer DDT_Ind) {
    this.DDT_Ind = DDT_Ind;
  }
  public t50_transaction with_DDT_Ind(Integer DDT_Ind) {
    this.DDT_Ind = DDT_Ind;
    return this;
  }
  private String Source_Sys_Cd;
  public String get_Source_Sys_Cd() {
    return Source_Sys_Cd;
  }
  public void set_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
  }
  public t50_transaction with_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
    return this;
  }
  private String City_Cd;
  public String get_City_Cd() {
    return City_Cd;
  }
  public void set_City_Cd(String City_Cd) {
    this.City_Cd = City_Cd;
  }
  public t50_transaction with_City_Cd(String City_Cd) {
    this.City_Cd = City_Cd;
    return this;
  }
  private String Industry_Cd;
  public String get_Industry_Cd() {
    return Industry_Cd;
  }
  public void set_Industry_Cd(String Industry_Cd) {
    this.Industry_Cd = Industry_Cd;
  }
  public t50_transaction with_Industry_Cd(String Industry_Cd) {
    this.Industry_Cd = Industry_Cd;
    return this;
  }
  private java.sql.Date Data_Dt;
  public java.sql.Date get_Data_Dt() {
    return Data_Dt;
  }
  public void set_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
  }
  public t50_transaction with_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
    return this;
  }
  private String Pay_Mode_Cd;
  public String get_Pay_Mode_Cd() {
    return Pay_Mode_Cd;
  }
  public void set_Pay_Mode_Cd(String Pay_Mode_Cd) {
    this.Pay_Mode_Cd = Pay_Mode_Cd;
  }
  public t50_transaction with_Pay_Mode_Cd(String Pay_Mode_Cd) {
    this.Pay_Mode_Cd = Pay_Mode_Cd;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof t50_transaction)) {
      return false;
    }
    t50_transaction that = (t50_transaction) o;
    boolean equal = true;
    equal = equal && (this.Tx_ID == null ? that.Tx_ID == null : this.Tx_ID.equals(that.Tx_ID));
    equal = equal && (this.Tx_Dt == null ? that.Tx_Dt == null : this.Tx_Dt.equals(that.Tx_Dt));
    equal = equal && (this.Tx_Tm == null ? that.Tx_Tm == null : this.Tx_Tm.equals(that.Tx_Tm));
    equal = equal && (this.Tx_Type_Cd == null ? that.Tx_Type_Cd == null : this.Tx_Type_Cd.equals(that.Tx_Type_Cd));
    equal = equal && (this.Tx_Cd == null ? that.Tx_Cd == null : this.Tx_Cd.equals(that.Tx_Cd));
    equal = equal && (this.Tx_Sub_Cd == null ? that.Tx_Sub_Cd == null : this.Tx_Sub_Cd.equals(that.Tx_Sub_Cd));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Opr_Pty_ID == null ? that.Opr_Pty_ID == null : this.Opr_Pty_ID.equals(that.Opr_Pty_ID));
    equal = equal && (this.Tkt_Provi_Pty_ID == null ? that.Tkt_Provi_Pty_ID == null : this.Tkt_Provi_Pty_ID.equals(that.Tkt_Provi_Pty_ID));
    equal = equal && (this.Ticket_Card_Type_Cd == null ? that.Ticket_Card_Type_Cd == null : this.Ticket_Card_Type_Cd.equals(that.Ticket_Card_Type_Cd));
    equal = equal && (this.Prod_ID == null ? that.Prod_ID == null : this.Prod_ID.equals(that.Prod_ID));
    equal = equal && (this.Prod_Group_ID == null ? that.Prod_Group_ID == null : this.Prod_Group_ID.equals(that.Prod_Group_ID));
    equal = equal && (this.Tkt_ID == null ? that.Tkt_ID == null : this.Tkt_ID.equals(that.Tkt_ID));
    equal = equal && (this.Tkt_Seq_Num == null ? that.Tkt_Seq_Num == null : this.Tkt_Seq_Num.equals(that.Tkt_Seq_Num));
    equal = equal && (this.Tkt_Life_Prd == null ? that.Tkt_Life_Prd == null : this.Tkt_Life_Prd.equals(that.Tkt_Life_Prd));
    equal = equal && (this.Ptn_Tx_Ind == null ? that.Ptn_Tx_Ind == null : this.Ptn_Tx_Ind.equals(that.Ptn_Tx_Ind));
    equal = equal && (this.Src_Prtcptr_Pty_ID == null ? that.Src_Prtcptr_Pty_ID == null : this.Src_Prtcptr_Pty_ID.equals(that.Src_Prtcptr_Pty_ID));
    equal = equal && (this.Equip_ID == null ? that.Equip_ID == null : this.Equip_ID.equals(that.Equip_ID));
    equal = equal && (this.Tx_Status_Ind == null ? that.Tx_Status_Ind == null : this.Tx_Status_Ind.equals(that.Tx_Status_Ind));
    equal = equal && (this.Stl_Dt == null ? that.Stl_Dt == null : this.Stl_Dt.equals(that.Stl_Dt));
    equal = equal && (this.Check_Entry_Dt == null ? that.Check_Entry_Dt == null : this.Check_Entry_Dt.equals(that.Check_Entry_Dt));
    equal = equal && (this.CCH_Irgul_Ind == null ? that.CCH_Irgul_Ind == null : this.CCH_Irgul_Ind.equals(that.CCH_Irgul_Ind));
    equal = equal && (this.CCH_Irgul_List == null ? that.CCH_Irgul_List == null : this.CCH_Irgul_List.equals(that.CCH_Irgul_List));
    equal = equal && (this.DDT_Ind == null ? that.DDT_Ind == null : this.DDT_Ind.equals(that.DDT_Ind));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.City_Cd == null ? that.City_Cd == null : this.City_Cd.equals(that.City_Cd));
    equal = equal && (this.Industry_Cd == null ? that.Industry_Cd == null : this.Industry_Cd.equals(that.Industry_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Pay_Mode_Cd == null ? that.Pay_Mode_Cd == null : this.Pay_Mode_Cd.equals(that.Pay_Mode_Cd));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof t50_transaction)) {
      return false;
    }
    t50_transaction that = (t50_transaction) o;
    boolean equal = true;
    equal = equal && (this.Tx_ID == null ? that.Tx_ID == null : this.Tx_ID.equals(that.Tx_ID));
    equal = equal && (this.Tx_Dt == null ? that.Tx_Dt == null : this.Tx_Dt.equals(that.Tx_Dt));
    equal = equal && (this.Tx_Tm == null ? that.Tx_Tm == null : this.Tx_Tm.equals(that.Tx_Tm));
    equal = equal && (this.Tx_Type_Cd == null ? that.Tx_Type_Cd == null : this.Tx_Type_Cd.equals(that.Tx_Type_Cd));
    equal = equal && (this.Tx_Cd == null ? that.Tx_Cd == null : this.Tx_Cd.equals(that.Tx_Cd));
    equal = equal && (this.Tx_Sub_Cd == null ? that.Tx_Sub_Cd == null : this.Tx_Sub_Cd.equals(that.Tx_Sub_Cd));
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Opr_Pty_ID == null ? that.Opr_Pty_ID == null : this.Opr_Pty_ID.equals(that.Opr_Pty_ID));
    equal = equal && (this.Tkt_Provi_Pty_ID == null ? that.Tkt_Provi_Pty_ID == null : this.Tkt_Provi_Pty_ID.equals(that.Tkt_Provi_Pty_ID));
    equal = equal && (this.Ticket_Card_Type_Cd == null ? that.Ticket_Card_Type_Cd == null : this.Ticket_Card_Type_Cd.equals(that.Ticket_Card_Type_Cd));
    equal = equal && (this.Prod_ID == null ? that.Prod_ID == null : this.Prod_ID.equals(that.Prod_ID));
    equal = equal && (this.Prod_Group_ID == null ? that.Prod_Group_ID == null : this.Prod_Group_ID.equals(that.Prod_Group_ID));
    equal = equal && (this.Tkt_ID == null ? that.Tkt_ID == null : this.Tkt_ID.equals(that.Tkt_ID));
    equal = equal && (this.Tkt_Seq_Num == null ? that.Tkt_Seq_Num == null : this.Tkt_Seq_Num.equals(that.Tkt_Seq_Num));
    equal = equal && (this.Tkt_Life_Prd == null ? that.Tkt_Life_Prd == null : this.Tkt_Life_Prd.equals(that.Tkt_Life_Prd));
    equal = equal && (this.Ptn_Tx_Ind == null ? that.Ptn_Tx_Ind == null : this.Ptn_Tx_Ind.equals(that.Ptn_Tx_Ind));
    equal = equal && (this.Src_Prtcptr_Pty_ID == null ? that.Src_Prtcptr_Pty_ID == null : this.Src_Prtcptr_Pty_ID.equals(that.Src_Prtcptr_Pty_ID));
    equal = equal && (this.Equip_ID == null ? that.Equip_ID == null : this.Equip_ID.equals(that.Equip_ID));
    equal = equal && (this.Tx_Status_Ind == null ? that.Tx_Status_Ind == null : this.Tx_Status_Ind.equals(that.Tx_Status_Ind));
    equal = equal && (this.Stl_Dt == null ? that.Stl_Dt == null : this.Stl_Dt.equals(that.Stl_Dt));
    equal = equal && (this.Check_Entry_Dt == null ? that.Check_Entry_Dt == null : this.Check_Entry_Dt.equals(that.Check_Entry_Dt));
    equal = equal && (this.CCH_Irgul_Ind == null ? that.CCH_Irgul_Ind == null : this.CCH_Irgul_Ind.equals(that.CCH_Irgul_Ind));
    equal = equal && (this.CCH_Irgul_List == null ? that.CCH_Irgul_List == null : this.CCH_Irgul_List.equals(that.CCH_Irgul_List));
    equal = equal && (this.DDT_Ind == null ? that.DDT_Ind == null : this.DDT_Ind.equals(that.DDT_Ind));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.City_Cd == null ? that.City_Cd == null : this.City_Cd.equals(that.City_Cd));
    equal = equal && (this.Industry_Cd == null ? that.Industry_Cd == null : this.Industry_Cd.equals(that.Industry_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Pay_Mode_Cd == null ? that.Pay_Mode_Cd == null : this.Pay_Mode_Cd.equals(that.Pay_Mode_Cd));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Tx_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Tx_Dt = JdbcWritableBridge.readDate(2, __dbResults);
    this.Tx_Tm = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.Tx_Type_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Tx_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Tx_Sub_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.Opr_Pty_ID = JdbcWritableBridge.readString(9, __dbResults);
    this.Tkt_Provi_Pty_ID = JdbcWritableBridge.readString(10, __dbResults);
    this.Ticket_Card_Type_Cd = JdbcWritableBridge.readString(11, __dbResults);
    this.Prod_ID = JdbcWritableBridge.readString(12, __dbResults);
    this.Prod_Group_ID = JdbcWritableBridge.readString(13, __dbResults);
    this.Tkt_ID = JdbcWritableBridge.readString(14, __dbResults);
    this.Tkt_Seq_Num = JdbcWritableBridge.readString(15, __dbResults);
    this.Tkt_Life_Prd = JdbcWritableBridge.readInteger(16, __dbResults);
    this.Ptn_Tx_Ind = JdbcWritableBridge.readInteger(17, __dbResults);
    this.Src_Prtcptr_Pty_ID = JdbcWritableBridge.readString(18, __dbResults);
    this.Equip_ID = JdbcWritableBridge.readString(19, __dbResults);
    this.Tx_Status_Ind = JdbcWritableBridge.readInteger(20, __dbResults);
    this.Stl_Dt = JdbcWritableBridge.readDate(21, __dbResults);
    this.Check_Entry_Dt = JdbcWritableBridge.readDate(22, __dbResults);
    this.CCH_Irgul_Ind = JdbcWritableBridge.readInteger(23, __dbResults);
    this.CCH_Irgul_List = JdbcWritableBridge.readString(24, __dbResults);
    this.DDT_Ind = JdbcWritableBridge.readInteger(25, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(26, __dbResults);
    this.City_Cd = JdbcWritableBridge.readString(27, __dbResults);
    this.Industry_Cd = JdbcWritableBridge.readString(28, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(29, __dbResults);
    this.Pay_Mode_Cd = JdbcWritableBridge.readString(30, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Tx_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Tx_Dt = JdbcWritableBridge.readDate(2, __dbResults);
    this.Tx_Tm = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.Tx_Type_Cd = JdbcWritableBridge.readString(4, __dbResults);
    this.Tx_Cd = JdbcWritableBridge.readString(5, __dbResults);
    this.Tx_Sub_Cd = JdbcWritableBridge.readString(6, __dbResults);
    this.Station_ID = JdbcWritableBridge.readString(7, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.Opr_Pty_ID = JdbcWritableBridge.readString(9, __dbResults);
    this.Tkt_Provi_Pty_ID = JdbcWritableBridge.readString(10, __dbResults);
    this.Ticket_Card_Type_Cd = JdbcWritableBridge.readString(11, __dbResults);
    this.Prod_ID = JdbcWritableBridge.readString(12, __dbResults);
    this.Prod_Group_ID = JdbcWritableBridge.readString(13, __dbResults);
    this.Tkt_ID = JdbcWritableBridge.readString(14, __dbResults);
    this.Tkt_Seq_Num = JdbcWritableBridge.readString(15, __dbResults);
    this.Tkt_Life_Prd = JdbcWritableBridge.readInteger(16, __dbResults);
    this.Ptn_Tx_Ind = JdbcWritableBridge.readInteger(17, __dbResults);
    this.Src_Prtcptr_Pty_ID = JdbcWritableBridge.readString(18, __dbResults);
    this.Equip_ID = JdbcWritableBridge.readString(19, __dbResults);
    this.Tx_Status_Ind = JdbcWritableBridge.readInteger(20, __dbResults);
    this.Stl_Dt = JdbcWritableBridge.readDate(21, __dbResults);
    this.Check_Entry_Dt = JdbcWritableBridge.readDate(22, __dbResults);
    this.CCH_Irgul_Ind = JdbcWritableBridge.readInteger(23, __dbResults);
    this.CCH_Irgul_List = JdbcWritableBridge.readString(24, __dbResults);
    this.DDT_Ind = JdbcWritableBridge.readInteger(25, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(26, __dbResults);
    this.City_Cd = JdbcWritableBridge.readString(27, __dbResults);
    this.Industry_Cd = JdbcWritableBridge.readString(28, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(29, __dbResults);
    this.Pay_Mode_Cd = JdbcWritableBridge.readString(30, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Tx_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Tx_Dt, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Tx_Tm, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Type_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Sub_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Opr_Pty_ID, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tkt_Provi_Pty_ID, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Ticket_Card_Type_Cd, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Prod_ID, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Prod_Group_ID, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tkt_ID, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tkt_Seq_Num, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Tkt_Life_Prd, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Ptn_Tx_Ind, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(Src_Prtcptr_Pty_ID, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Equip_ID, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Tx_Status_Ind, 20 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeDate(Stl_Dt, 21 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Check_Entry_Dt, 22 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(CCH_Irgul_Ind, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(CCH_Irgul_List, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(DDT_Ind, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 26 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(City_Cd, 27 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Industry_Cd, 28 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 29 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Pay_Mode_Cd, 30 + __off, 1, __dbStmt);
    return 30;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Tx_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Tx_Dt, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTimestamp(Tx_Tm, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Type_Cd, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Cd, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Tx_Sub_Cd, 6 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Station_ID, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Opr_Pty_ID, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tkt_Provi_Pty_ID, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Ticket_Card_Type_Cd, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Prod_ID, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Prod_Group_ID, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tkt_ID, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Tkt_Seq_Num, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Tkt_Life_Prd, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Ptn_Tx_Ind, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(Src_Prtcptr_Pty_ID, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Equip_ID, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Tx_Status_Ind, 20 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeDate(Stl_Dt, 21 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Check_Entry_Dt, 22 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(CCH_Irgul_Ind, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(CCH_Irgul_List, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(DDT_Ind, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 26 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(City_Cd, 27 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Industry_Cd, 28 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 29 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Pay_Mode_Cd, 30 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Tx_ID = null;
    } else {
    this.Tx_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Dt = null;
    } else {
    this.Tx_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Tm = null;
    } else {
    this.Tx_Tm = new Timestamp(__dataIn.readLong());
    this.Tx_Tm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Type_Cd = null;
    } else {
    this.Tx_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Cd = null;
    } else {
    this.Tx_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Sub_Cd = null;
    } else {
    this.Tx_Sub_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Station_ID = null;
    } else {
    this.Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Line_ID = null;
    } else {
    this.Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Opr_Pty_ID = null;
    } else {
    this.Opr_Pty_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tkt_Provi_Pty_ID = null;
    } else {
    this.Tkt_Provi_Pty_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Ticket_Card_Type_Cd = null;
    } else {
    this.Ticket_Card_Type_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Prod_ID = null;
    } else {
    this.Prod_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Prod_Group_ID = null;
    } else {
    this.Prod_Group_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tkt_ID = null;
    } else {
    this.Tkt_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tkt_Seq_Num = null;
    } else {
    this.Tkt_Seq_Num = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tkt_Life_Prd = null;
    } else {
    this.Tkt_Life_Prd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Ptn_Tx_Ind = null;
    } else {
    this.Ptn_Tx_Ind = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Src_Prtcptr_Pty_ID = null;
    } else {
    this.Src_Prtcptr_Pty_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Equip_ID = null;
    } else {
    this.Equip_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Tx_Status_Ind = null;
    } else {
    this.Tx_Status_Ind = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Stl_Dt = null;
    } else {
    this.Stl_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Check_Entry_Dt = null;
    } else {
    this.Check_Entry_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.CCH_Irgul_Ind = null;
    } else {
    this.CCH_Irgul_Ind = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CCH_Irgul_List = null;
    } else {
    this.CCH_Irgul_List = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DDT_Ind = null;
    } else {
    this.DDT_Ind = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Source_Sys_Cd = null;
    } else {
    this.Source_Sys_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.City_Cd = null;
    } else {
    this.City_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Industry_Cd = null;
    } else {
    this.Industry_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Data_Dt = null;
    } else {
    this.Data_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Pay_Mode_Cd = null;
    } else {
    this.Pay_Mode_Cd = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Tx_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_ID);
    }
    if (null == this.Tx_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Tx_Dt.getTime());
    }
    if (null == this.Tx_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Tx_Tm.getTime());
    __dataOut.writeInt(this.Tx_Tm.getNanos());
    }
    if (null == this.Tx_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Type_Cd);
    }
    if (null == this.Tx_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Cd);
    }
    if (null == this.Tx_Sub_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Sub_Cd);
    }
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Opr_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Opr_Pty_ID);
    }
    if (null == this.Tkt_Provi_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tkt_Provi_Pty_ID);
    }
    if (null == this.Ticket_Card_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ticket_Card_Type_Cd);
    }
    if (null == this.Prod_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Prod_ID);
    }
    if (null == this.Prod_Group_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Prod_Group_ID);
    }
    if (null == this.Tkt_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tkt_ID);
    }
    if (null == this.Tkt_Seq_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tkt_Seq_Num);
    }
    if (null == this.Tkt_Life_Prd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Tkt_Life_Prd);
    }
    if (null == this.Ptn_Tx_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Ptn_Tx_Ind);
    }
    if (null == this.Src_Prtcptr_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Src_Prtcptr_Pty_ID);
    }
    if (null == this.Equip_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Equip_ID);
    }
    if (null == this.Tx_Status_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Tx_Status_Ind);
    }
    if (null == this.Stl_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stl_Dt.getTime());
    }
    if (null == this.Check_Entry_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Check_Entry_Dt.getTime());
    }
    if (null == this.CCH_Irgul_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CCH_Irgul_Ind);
    }
    if (null == this.CCH_Irgul_List) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CCH_Irgul_List);
    }
    if (null == this.DDT_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DDT_Ind);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
    }
    if (null == this.City_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City_Cd);
    }
    if (null == this.Industry_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Industry_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Pay_Mode_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pay_Mode_Cd);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Tx_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_ID);
    }
    if (null == this.Tx_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Tx_Dt.getTime());
    }
    if (null == this.Tx_Tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Tx_Tm.getTime());
    __dataOut.writeInt(this.Tx_Tm.getNanos());
    }
    if (null == this.Tx_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Type_Cd);
    }
    if (null == this.Tx_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Cd);
    }
    if (null == this.Tx_Sub_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tx_Sub_Cd);
    }
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Opr_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Opr_Pty_ID);
    }
    if (null == this.Tkt_Provi_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tkt_Provi_Pty_ID);
    }
    if (null == this.Ticket_Card_Type_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ticket_Card_Type_Cd);
    }
    if (null == this.Prod_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Prod_ID);
    }
    if (null == this.Prod_Group_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Prod_Group_ID);
    }
    if (null == this.Tkt_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tkt_ID);
    }
    if (null == this.Tkt_Seq_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Tkt_Seq_Num);
    }
    if (null == this.Tkt_Life_Prd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Tkt_Life_Prd);
    }
    if (null == this.Ptn_Tx_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Ptn_Tx_Ind);
    }
    if (null == this.Src_Prtcptr_Pty_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Src_Prtcptr_Pty_ID);
    }
    if (null == this.Equip_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Equip_ID);
    }
    if (null == this.Tx_Status_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Tx_Status_Ind);
    }
    if (null == this.Stl_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Stl_Dt.getTime());
    }
    if (null == this.Check_Entry_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Check_Entry_Dt.getTime());
    }
    if (null == this.CCH_Irgul_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CCH_Irgul_Ind);
    }
    if (null == this.CCH_Irgul_List) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CCH_Irgul_List);
    }
    if (null == this.DDT_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DDT_Ind);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
    }
    if (null == this.City_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City_Cd);
    }
    if (null == this.Industry_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Industry_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Pay_Mode_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pay_Mode_Cd);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_ID==null?"\\N":Tx_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Dt==null?"\\N":"" + Tx_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Tm==null?"\\N":"" + Tx_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Type_Cd==null?"\\N":Tx_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Cd==null?"\\N":Tx_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Sub_Cd==null?"\\N":Tx_Sub_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Opr_Pty_ID==null?"\\N":Opr_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_Provi_Pty_ID==null?"\\N":Tkt_Provi_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ticket_Card_Type_Cd==null?"\\N":Ticket_Card_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prod_ID==null?"\\N":Prod_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prod_Group_ID==null?"\\N":Prod_Group_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_ID==null?"\\N":Tkt_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_Seq_Num==null?"\\N":Tkt_Seq_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_Life_Prd==null?"\\N":"" + Tkt_Life_Prd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ptn_Tx_Ind==null?"\\N":"" + Ptn_Tx_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Src_Prtcptr_Pty_ID==null?"\\N":Src_Prtcptr_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Equip_ID==null?"\\N":Equip_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Status_Ind==null?"\\N":"" + Tx_Status_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stl_Dt==null?"\\N":"" + Stl_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Check_Entry_Dt==null?"\\N":"" + Check_Entry_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CCH_Irgul_Ind==null?"\\N":"" + CCH_Irgul_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CCH_Irgul_List==null?"\\N":CCH_Irgul_List, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DDT_Ind==null?"\\N":"" + DDT_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City_Cd==null?"\\N":City_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Industry_Cd==null?"\\N":Industry_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pay_Mode_Cd==null?"\\N":Pay_Mode_Cd, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_ID==null?"\\N":Tx_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Dt==null?"\\N":"" + Tx_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Tm==null?"\\N":"" + Tx_Tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Type_Cd==null?"\\N":Tx_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Cd==null?"\\N":Tx_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Sub_Cd==null?"\\N":Tx_Sub_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Opr_Pty_ID==null?"\\N":Opr_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_Provi_Pty_ID==null?"\\N":Tkt_Provi_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ticket_Card_Type_Cd==null?"\\N":Ticket_Card_Type_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prod_ID==null?"\\N":Prod_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Prod_Group_ID==null?"\\N":Prod_Group_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_ID==null?"\\N":Tkt_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_Seq_Num==null?"\\N":Tkt_Seq_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tkt_Life_Prd==null?"\\N":"" + Tkt_Life_Prd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ptn_Tx_Ind==null?"\\N":"" + Ptn_Tx_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Src_Prtcptr_Pty_ID==null?"\\N":Src_Prtcptr_Pty_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Equip_ID==null?"\\N":Equip_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Tx_Status_Ind==null?"\\N":"" + Tx_Status_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Stl_Dt==null?"\\N":"" + Stl_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Check_Entry_Dt==null?"\\N":"" + Check_Entry_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CCH_Irgul_Ind==null?"\\N":"" + CCH_Irgul_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CCH_Irgul_List==null?"\\N":CCH_Irgul_List, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DDT_Ind==null?"\\N":"" + DDT_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City_Cd==null?"\\N":City_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Industry_Cd==null?"\\N":Industry_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pay_Mode_Cd==null?"\\N":Pay_Mode_Cd, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_ID = null; } else {
      this.Tx_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tx_Dt = null; } else {
      this.Tx_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tx_Tm = null; } else {
      this.Tx_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Type_Cd = null; } else {
      this.Tx_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Cd = null; } else {
      this.Tx_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Sub_Cd = null; } else {
      this.Tx_Sub_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Opr_Pty_ID = null; } else {
      this.Opr_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tkt_Provi_Pty_ID = null; } else {
      this.Tkt_Provi_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Ticket_Card_Type_Cd = null; } else {
      this.Ticket_Card_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Prod_ID = null; } else {
      this.Prod_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Prod_Group_ID = null; } else {
      this.Prod_Group_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tkt_ID = null; } else {
      this.Tkt_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tkt_Seq_Num = null; } else {
      this.Tkt_Seq_Num = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tkt_Life_Prd = null; } else {
      this.Tkt_Life_Prd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Ptn_Tx_Ind = null; } else {
      this.Ptn_Tx_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Src_Prtcptr_Pty_ID = null; } else {
      this.Src_Prtcptr_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Equip_ID = null; } else {
      this.Equip_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tx_Status_Ind = null; } else {
      this.Tx_Status_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Stl_Dt = null; } else {
      this.Stl_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Check_Entry_Dt = null; } else {
      this.Check_Entry_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CCH_Irgul_Ind = null; } else {
      this.CCH_Irgul_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CCH_Irgul_List = null; } else {
      this.CCH_Irgul_List = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DDT_Ind = null; } else {
      this.DDT_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Source_Sys_Cd = null; } else {
      this.Source_Sys_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.City_Cd = null; } else {
      this.City_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Industry_Cd = null; } else {
      this.Industry_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Pay_Mode_Cd = null; } else {
      this.Pay_Mode_Cd = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_ID = null; } else {
      this.Tx_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tx_Dt = null; } else {
      this.Tx_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tx_Tm = null; } else {
      this.Tx_Tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Type_Cd = null; } else {
      this.Tx_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Cd = null; } else {
      this.Tx_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tx_Sub_Cd = null; } else {
      this.Tx_Sub_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Opr_Pty_ID = null; } else {
      this.Opr_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tkt_Provi_Pty_ID = null; } else {
      this.Tkt_Provi_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Ticket_Card_Type_Cd = null; } else {
      this.Ticket_Card_Type_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Prod_ID = null; } else {
      this.Prod_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Prod_Group_ID = null; } else {
      this.Prod_Group_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tkt_ID = null; } else {
      this.Tkt_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Tkt_Seq_Num = null; } else {
      this.Tkt_Seq_Num = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tkt_Life_Prd = null; } else {
      this.Tkt_Life_Prd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Ptn_Tx_Ind = null; } else {
      this.Ptn_Tx_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Src_Prtcptr_Pty_ID = null; } else {
      this.Src_Prtcptr_Pty_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Equip_ID = null; } else {
      this.Equip_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Tx_Status_Ind = null; } else {
      this.Tx_Status_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Stl_Dt = null; } else {
      this.Stl_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Check_Entry_Dt = null; } else {
      this.Check_Entry_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CCH_Irgul_Ind = null; } else {
      this.CCH_Irgul_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CCH_Irgul_List = null; } else {
      this.CCH_Irgul_List = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DDT_Ind = null; } else {
      this.DDT_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Source_Sys_Cd = null; } else {
      this.Source_Sys_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.City_Cd = null; } else {
      this.City_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Industry_Cd = null; } else {
      this.Industry_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Pay_Mode_Cd = null; } else {
      this.Pay_Mode_Cd = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    t50_transaction o = (t50_transaction) super.clone();
    o.Tx_Dt = (o.Tx_Dt != null) ? (java.sql.Date) o.Tx_Dt.clone() : null;
    o.Tx_Tm = (o.Tx_Tm != null) ? (java.sql.Timestamp) o.Tx_Tm.clone() : null;
    o.Stl_Dt = (o.Stl_Dt != null) ? (java.sql.Date) o.Stl_Dt.clone() : null;
    o.Check_Entry_Dt = (o.Check_Entry_Dt != null) ? (java.sql.Date) o.Check_Entry_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
    return o;
  }

  public void clone0(t50_transaction o) throws CloneNotSupportedException {
    o.Tx_Dt = (o.Tx_Dt != null) ? (java.sql.Date) o.Tx_Dt.clone() : null;
    o.Tx_Tm = (o.Tx_Tm != null) ? (java.sql.Timestamp) o.Tx_Tm.clone() : null;
    o.Stl_Dt = (o.Stl_Dt != null) ? (java.sql.Date) o.Stl_Dt.clone() : null;
    o.Check_Entry_Dt = (o.Check_Entry_Dt != null) ? (java.sql.Date) o.Check_Entry_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Tx_ID", this.Tx_ID);
    __sqoop$field_map.put("Tx_Dt", this.Tx_Dt);
    __sqoop$field_map.put("Tx_Tm", this.Tx_Tm);
    __sqoop$field_map.put("Tx_Type_Cd", this.Tx_Type_Cd);
    __sqoop$field_map.put("Tx_Cd", this.Tx_Cd);
    __sqoop$field_map.put("Tx_Sub_Cd", this.Tx_Sub_Cd);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Opr_Pty_ID", this.Opr_Pty_ID);
    __sqoop$field_map.put("Tkt_Provi_Pty_ID", this.Tkt_Provi_Pty_ID);
    __sqoop$field_map.put("Ticket_Card_Type_Cd", this.Ticket_Card_Type_Cd);
    __sqoop$field_map.put("Prod_ID", this.Prod_ID);
    __sqoop$field_map.put("Prod_Group_ID", this.Prod_Group_ID);
    __sqoop$field_map.put("Tkt_ID", this.Tkt_ID);
    __sqoop$field_map.put("Tkt_Seq_Num", this.Tkt_Seq_Num);
    __sqoop$field_map.put("Tkt_Life_Prd", this.Tkt_Life_Prd);
    __sqoop$field_map.put("Ptn_Tx_Ind", this.Ptn_Tx_Ind);
    __sqoop$field_map.put("Src_Prtcptr_Pty_ID", this.Src_Prtcptr_Pty_ID);
    __sqoop$field_map.put("Equip_ID", this.Equip_ID);
    __sqoop$field_map.put("Tx_Status_Ind", this.Tx_Status_Ind);
    __sqoop$field_map.put("Stl_Dt", this.Stl_Dt);
    __sqoop$field_map.put("Check_Entry_Dt", this.Check_Entry_Dt);
    __sqoop$field_map.put("CCH_Irgul_Ind", this.CCH_Irgul_Ind);
    __sqoop$field_map.put("CCH_Irgul_List", this.CCH_Irgul_List);
    __sqoop$field_map.put("DDT_Ind", this.DDT_Ind);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("City_Cd", this.City_Cd);
    __sqoop$field_map.put("Industry_Cd", this.Industry_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Pay_Mode_Cd", this.Pay_Mode_Cd);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Tx_ID", this.Tx_ID);
    __sqoop$field_map.put("Tx_Dt", this.Tx_Dt);
    __sqoop$field_map.put("Tx_Tm", this.Tx_Tm);
    __sqoop$field_map.put("Tx_Type_Cd", this.Tx_Type_Cd);
    __sqoop$field_map.put("Tx_Cd", this.Tx_Cd);
    __sqoop$field_map.put("Tx_Sub_Cd", this.Tx_Sub_Cd);
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Opr_Pty_ID", this.Opr_Pty_ID);
    __sqoop$field_map.put("Tkt_Provi_Pty_ID", this.Tkt_Provi_Pty_ID);
    __sqoop$field_map.put("Ticket_Card_Type_Cd", this.Ticket_Card_Type_Cd);
    __sqoop$field_map.put("Prod_ID", this.Prod_ID);
    __sqoop$field_map.put("Prod_Group_ID", this.Prod_Group_ID);
    __sqoop$field_map.put("Tkt_ID", this.Tkt_ID);
    __sqoop$field_map.put("Tkt_Seq_Num", this.Tkt_Seq_Num);
    __sqoop$field_map.put("Tkt_Life_Prd", this.Tkt_Life_Prd);
    __sqoop$field_map.put("Ptn_Tx_Ind", this.Ptn_Tx_Ind);
    __sqoop$field_map.put("Src_Prtcptr_Pty_ID", this.Src_Prtcptr_Pty_ID);
    __sqoop$field_map.put("Equip_ID", this.Equip_ID);
    __sqoop$field_map.put("Tx_Status_Ind", this.Tx_Status_Ind);
    __sqoop$field_map.put("Stl_Dt", this.Stl_Dt);
    __sqoop$field_map.put("Check_Entry_Dt", this.Check_Entry_Dt);
    __sqoop$field_map.put("CCH_Irgul_Ind", this.CCH_Irgul_Ind);
    __sqoop$field_map.put("CCH_Irgul_List", this.CCH_Irgul_List);
    __sqoop$field_map.put("DDT_Ind", this.DDT_Ind);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("City_Cd", this.City_Cd);
    __sqoop$field_map.put("Industry_Cd", this.Industry_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Pay_Mode_Cd", this.Pay_Mode_Cd);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
