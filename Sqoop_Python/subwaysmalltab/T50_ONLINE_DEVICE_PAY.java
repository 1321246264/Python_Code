// ORM class for table 'T50_ONLINE_DEVICE_PAY'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 02 13:35:28 CST 2020
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

public class T50_ONLINE_DEVICE_PAY extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("Order_no", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.Order_no = (String)value;
      }
    });
    setters.put("Businesstype", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.Businesstype = (String)value;
      }
    });
    setters.put("CardIssuerID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.CardIssuerID = (String)value;
      }
    });
    setters.put("sourceParticipantId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.sourceParticipantId = (String)value;
      }
    });
    setters.put("line_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.line_id = (String)value;
      }
    });
    setters.put("station_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.station_id = (String)value;
      }
    });
    setters.put("device_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.device_type = (String)value;
      }
    });
    setters.put("UDSN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.UDSN = (String)value;
      }
    });
    setters.put("tx_dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.tx_dt = (java.sql.Date)value;
      }
    });
    setters.put("tx_tm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.tx_tm = (java.sql.Timestamp)value;
      }
    });
    setters.put("OPBC_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.OPBC_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("RMAC_NUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.RMAC_NUMBER = (String)value;
      }
    });
    setters.put("data_dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.data_dt = (java.sql.Date)value;
      }
    });
    setters.put("ProductCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.ProductCategory = (String)value;
      }
    });
    setters.put("prod_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.prod_id = (String)value;
      }
    });
    setters.put("UD_Type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.UD_Type = (String)value;
      }
    });
    setters.put("UD_SUBTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.UD_SUBTYPE = (String)value;
      }
    });
    setters.put("CARD_SERIAL_NUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.CARD_SERIAL_NUMBER = (String)value;
      }
    });
    setters.put("Ticket_amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.Ticket_amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("TicketOrderNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.TicketOrderNumber = (String)value;
      }
    });
    setters.put("LifeCycle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.LifeCycle = (String)value;
      }
    });
    setters.put("AfterTransAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.AfterTransAmount = (Integer)value;
      }
    });
    setters.put("TransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.TransType = (String)value;
      }
    });
    setters.put("TicketStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.TicketStatus = (String)value;
      }
    });
    setters.put("PayType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.PayType = (String)value;
      }
    });
    setters.put("PayStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.PayStatus = (String)value;
      }
    });
    setters.put("PayChannel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.PayChannel = (String)value;
      }
    });
    setters.put("ChannelNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.ChannelNumber = (String)value;
      }
    });
    setters.put("SamId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T50_ONLINE_DEVICE_PAY.this.SamId = (String)value;
      }
    });
  }
  public T50_ONLINE_DEVICE_PAY() {
    init0();
  }
  private java.math.BigDecimal ID;
  public java.math.BigDecimal get_ID() {
    return ID;
  }
  public void set_ID(java.math.BigDecimal ID) {
    this.ID = ID;
  }
  public T50_ONLINE_DEVICE_PAY with_ID(java.math.BigDecimal ID) {
    this.ID = ID;
    return this;
  }
  private String Order_no;
  public String get_Order_no() {
    return Order_no;
  }
  public void set_Order_no(String Order_no) {
    this.Order_no = Order_no;
  }
  public T50_ONLINE_DEVICE_PAY with_Order_no(String Order_no) {
    this.Order_no = Order_no;
    return this;
  }
  private String Businesstype;
  public String get_Businesstype() {
    return Businesstype;
  }
  public void set_Businesstype(String Businesstype) {
    this.Businesstype = Businesstype;
  }
  public T50_ONLINE_DEVICE_PAY with_Businesstype(String Businesstype) {
    this.Businesstype = Businesstype;
    return this;
  }
  private String CardIssuerID;
  public String get_CardIssuerID() {
    return CardIssuerID;
  }
  public void set_CardIssuerID(String CardIssuerID) {
    this.CardIssuerID = CardIssuerID;
  }
  public T50_ONLINE_DEVICE_PAY with_CardIssuerID(String CardIssuerID) {
    this.CardIssuerID = CardIssuerID;
    return this;
  }
  private String sourceParticipantId;
  public String get_sourceParticipantId() {
    return sourceParticipantId;
  }
  public void set_sourceParticipantId(String sourceParticipantId) {
    this.sourceParticipantId = sourceParticipantId;
  }
  public T50_ONLINE_DEVICE_PAY with_sourceParticipantId(String sourceParticipantId) {
    this.sourceParticipantId = sourceParticipantId;
    return this;
  }
  private String line_id;
  public String get_line_id() {
    return line_id;
  }
  public void set_line_id(String line_id) {
    this.line_id = line_id;
  }
  public T50_ONLINE_DEVICE_PAY with_line_id(String line_id) {
    this.line_id = line_id;
    return this;
  }
  private String station_id;
  public String get_station_id() {
    return station_id;
  }
  public void set_station_id(String station_id) {
    this.station_id = station_id;
  }
  public T50_ONLINE_DEVICE_PAY with_station_id(String station_id) {
    this.station_id = station_id;
    return this;
  }
  private String device_type;
  public String get_device_type() {
    return device_type;
  }
  public void set_device_type(String device_type) {
    this.device_type = device_type;
  }
  public T50_ONLINE_DEVICE_PAY with_device_type(String device_type) {
    this.device_type = device_type;
    return this;
  }
  private String UDSN;
  public String get_UDSN() {
    return UDSN;
  }
  public void set_UDSN(String UDSN) {
    this.UDSN = UDSN;
  }
  public T50_ONLINE_DEVICE_PAY with_UDSN(String UDSN) {
    this.UDSN = UDSN;
    return this;
  }
  private java.sql.Date tx_dt;
  public java.sql.Date get_tx_dt() {
    return tx_dt;
  }
  public void set_tx_dt(java.sql.Date tx_dt) {
    this.tx_dt = tx_dt;
  }
  public T50_ONLINE_DEVICE_PAY with_tx_dt(java.sql.Date tx_dt) {
    this.tx_dt = tx_dt;
    return this;
  }
  private java.sql.Timestamp tx_tm;
  public java.sql.Timestamp get_tx_tm() {
    return tx_tm;
  }
  public void set_tx_tm(java.sql.Timestamp tx_tm) {
    this.tx_tm = tx_tm;
  }
  public T50_ONLINE_DEVICE_PAY with_tx_tm(java.sql.Timestamp tx_tm) {
    this.tx_tm = tx_tm;
    return this;
  }
  private java.sql.Timestamp OPBC_time;
  public java.sql.Timestamp get_OPBC_time() {
    return OPBC_time;
  }
  public void set_OPBC_time(java.sql.Timestamp OPBC_time) {
    this.OPBC_time = OPBC_time;
  }
  public T50_ONLINE_DEVICE_PAY with_OPBC_time(java.sql.Timestamp OPBC_time) {
    this.OPBC_time = OPBC_time;
    return this;
  }
  private String RMAC_NUMBER;
  public String get_RMAC_NUMBER() {
    return RMAC_NUMBER;
  }
  public void set_RMAC_NUMBER(String RMAC_NUMBER) {
    this.RMAC_NUMBER = RMAC_NUMBER;
  }
  public T50_ONLINE_DEVICE_PAY with_RMAC_NUMBER(String RMAC_NUMBER) {
    this.RMAC_NUMBER = RMAC_NUMBER;
    return this;
  }
  private java.sql.Date data_dt;
  public java.sql.Date get_data_dt() {
    return data_dt;
  }
  public void set_data_dt(java.sql.Date data_dt) {
    this.data_dt = data_dt;
  }
  public T50_ONLINE_DEVICE_PAY with_data_dt(java.sql.Date data_dt) {
    this.data_dt = data_dt;
    return this;
  }
  private String ProductCategory;
  public String get_ProductCategory() {
    return ProductCategory;
  }
  public void set_ProductCategory(String ProductCategory) {
    this.ProductCategory = ProductCategory;
  }
  public T50_ONLINE_DEVICE_PAY with_ProductCategory(String ProductCategory) {
    this.ProductCategory = ProductCategory;
    return this;
  }
  private String prod_id;
  public String get_prod_id() {
    return prod_id;
  }
  public void set_prod_id(String prod_id) {
    this.prod_id = prod_id;
  }
  public T50_ONLINE_DEVICE_PAY with_prod_id(String prod_id) {
    this.prod_id = prod_id;
    return this;
  }
  private String UD_Type;
  public String get_UD_Type() {
    return UD_Type;
  }
  public void set_UD_Type(String UD_Type) {
    this.UD_Type = UD_Type;
  }
  public T50_ONLINE_DEVICE_PAY with_UD_Type(String UD_Type) {
    this.UD_Type = UD_Type;
    return this;
  }
  private String UD_SUBTYPE;
  public String get_UD_SUBTYPE() {
    return UD_SUBTYPE;
  }
  public void set_UD_SUBTYPE(String UD_SUBTYPE) {
    this.UD_SUBTYPE = UD_SUBTYPE;
  }
  public T50_ONLINE_DEVICE_PAY with_UD_SUBTYPE(String UD_SUBTYPE) {
    this.UD_SUBTYPE = UD_SUBTYPE;
    return this;
  }
  private String CARD_SERIAL_NUMBER;
  public String get_CARD_SERIAL_NUMBER() {
    return CARD_SERIAL_NUMBER;
  }
  public void set_CARD_SERIAL_NUMBER(String CARD_SERIAL_NUMBER) {
    this.CARD_SERIAL_NUMBER = CARD_SERIAL_NUMBER;
  }
  public T50_ONLINE_DEVICE_PAY with_CARD_SERIAL_NUMBER(String CARD_SERIAL_NUMBER) {
    this.CARD_SERIAL_NUMBER = CARD_SERIAL_NUMBER;
    return this;
  }
  private java.math.BigDecimal Ticket_amount;
  public java.math.BigDecimal get_Ticket_amount() {
    return Ticket_amount;
  }
  public void set_Ticket_amount(java.math.BigDecimal Ticket_amount) {
    this.Ticket_amount = Ticket_amount;
  }
  public T50_ONLINE_DEVICE_PAY with_Ticket_amount(java.math.BigDecimal Ticket_amount) {
    this.Ticket_amount = Ticket_amount;
    return this;
  }
  private String TicketOrderNumber;
  public String get_TicketOrderNumber() {
    return TicketOrderNumber;
  }
  public void set_TicketOrderNumber(String TicketOrderNumber) {
    this.TicketOrderNumber = TicketOrderNumber;
  }
  public T50_ONLINE_DEVICE_PAY with_TicketOrderNumber(String TicketOrderNumber) {
    this.TicketOrderNumber = TicketOrderNumber;
    return this;
  }
  private String LifeCycle;
  public String get_LifeCycle() {
    return LifeCycle;
  }
  public void set_LifeCycle(String LifeCycle) {
    this.LifeCycle = LifeCycle;
  }
  public T50_ONLINE_DEVICE_PAY with_LifeCycle(String LifeCycle) {
    this.LifeCycle = LifeCycle;
    return this;
  }
  private Integer AfterTransAmount;
  public Integer get_AfterTransAmount() {
    return AfterTransAmount;
  }
  public void set_AfterTransAmount(Integer AfterTransAmount) {
    this.AfterTransAmount = AfterTransAmount;
  }
  public T50_ONLINE_DEVICE_PAY with_AfterTransAmount(Integer AfterTransAmount) {
    this.AfterTransAmount = AfterTransAmount;
    return this;
  }
  private String TransType;
  public String get_TransType() {
    return TransType;
  }
  public void set_TransType(String TransType) {
    this.TransType = TransType;
  }
  public T50_ONLINE_DEVICE_PAY with_TransType(String TransType) {
    this.TransType = TransType;
    return this;
  }
  private String TicketStatus;
  public String get_TicketStatus() {
    return TicketStatus;
  }
  public void set_TicketStatus(String TicketStatus) {
    this.TicketStatus = TicketStatus;
  }
  public T50_ONLINE_DEVICE_PAY with_TicketStatus(String TicketStatus) {
    this.TicketStatus = TicketStatus;
    return this;
  }
  private String PayType;
  public String get_PayType() {
    return PayType;
  }
  public void set_PayType(String PayType) {
    this.PayType = PayType;
  }
  public T50_ONLINE_DEVICE_PAY with_PayType(String PayType) {
    this.PayType = PayType;
    return this;
  }
  private String PayStatus;
  public String get_PayStatus() {
    return PayStatus;
  }
  public void set_PayStatus(String PayStatus) {
    this.PayStatus = PayStatus;
  }
  public T50_ONLINE_DEVICE_PAY with_PayStatus(String PayStatus) {
    this.PayStatus = PayStatus;
    return this;
  }
  private String PayChannel;
  public String get_PayChannel() {
    return PayChannel;
  }
  public void set_PayChannel(String PayChannel) {
    this.PayChannel = PayChannel;
  }
  public T50_ONLINE_DEVICE_PAY with_PayChannel(String PayChannel) {
    this.PayChannel = PayChannel;
    return this;
  }
  private String ChannelNumber;
  public String get_ChannelNumber() {
    return ChannelNumber;
  }
  public void set_ChannelNumber(String ChannelNumber) {
    this.ChannelNumber = ChannelNumber;
  }
  public T50_ONLINE_DEVICE_PAY with_ChannelNumber(String ChannelNumber) {
    this.ChannelNumber = ChannelNumber;
    return this;
  }
  private String SamId;
  public String get_SamId() {
    return SamId;
  }
  public void set_SamId(String SamId) {
    this.SamId = SamId;
  }
  public T50_ONLINE_DEVICE_PAY with_SamId(String SamId) {
    this.SamId = SamId;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T50_ONLINE_DEVICE_PAY)) {
      return false;
    }
    T50_ONLINE_DEVICE_PAY that = (T50_ONLINE_DEVICE_PAY) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.Order_no == null ? that.Order_no == null : this.Order_no.equals(that.Order_no));
    equal = equal && (this.Businesstype == null ? that.Businesstype == null : this.Businesstype.equals(that.Businesstype));
    equal = equal && (this.CardIssuerID == null ? that.CardIssuerID == null : this.CardIssuerID.equals(that.CardIssuerID));
    equal = equal && (this.sourceParticipantId == null ? that.sourceParticipantId == null : this.sourceParticipantId.equals(that.sourceParticipantId));
    equal = equal && (this.line_id == null ? that.line_id == null : this.line_id.equals(that.line_id));
    equal = equal && (this.station_id == null ? that.station_id == null : this.station_id.equals(that.station_id));
    equal = equal && (this.device_type == null ? that.device_type == null : this.device_type.equals(that.device_type));
    equal = equal && (this.UDSN == null ? that.UDSN == null : this.UDSN.equals(that.UDSN));
    equal = equal && (this.tx_dt == null ? that.tx_dt == null : this.tx_dt.equals(that.tx_dt));
    equal = equal && (this.tx_tm == null ? that.tx_tm == null : this.tx_tm.equals(that.tx_tm));
    equal = equal && (this.OPBC_time == null ? that.OPBC_time == null : this.OPBC_time.equals(that.OPBC_time));
    equal = equal && (this.RMAC_NUMBER == null ? that.RMAC_NUMBER == null : this.RMAC_NUMBER.equals(that.RMAC_NUMBER));
    equal = equal && (this.data_dt == null ? that.data_dt == null : this.data_dt.equals(that.data_dt));
    equal = equal && (this.ProductCategory == null ? that.ProductCategory == null : this.ProductCategory.equals(that.ProductCategory));
    equal = equal && (this.prod_id == null ? that.prod_id == null : this.prod_id.equals(that.prod_id));
    equal = equal && (this.UD_Type == null ? that.UD_Type == null : this.UD_Type.equals(that.UD_Type));
    equal = equal && (this.UD_SUBTYPE == null ? that.UD_SUBTYPE == null : this.UD_SUBTYPE.equals(that.UD_SUBTYPE));
    equal = equal && (this.CARD_SERIAL_NUMBER == null ? that.CARD_SERIAL_NUMBER == null : this.CARD_SERIAL_NUMBER.equals(that.CARD_SERIAL_NUMBER));
    equal = equal && (this.Ticket_amount == null ? that.Ticket_amount == null : this.Ticket_amount.equals(that.Ticket_amount));
    equal = equal && (this.TicketOrderNumber == null ? that.TicketOrderNumber == null : this.TicketOrderNumber.equals(that.TicketOrderNumber));
    equal = equal && (this.LifeCycle == null ? that.LifeCycle == null : this.LifeCycle.equals(that.LifeCycle));
    equal = equal && (this.AfterTransAmount == null ? that.AfterTransAmount == null : this.AfterTransAmount.equals(that.AfterTransAmount));
    equal = equal && (this.TransType == null ? that.TransType == null : this.TransType.equals(that.TransType));
    equal = equal && (this.TicketStatus == null ? that.TicketStatus == null : this.TicketStatus.equals(that.TicketStatus));
    equal = equal && (this.PayType == null ? that.PayType == null : this.PayType.equals(that.PayType));
    equal = equal && (this.PayStatus == null ? that.PayStatus == null : this.PayStatus.equals(that.PayStatus));
    equal = equal && (this.PayChannel == null ? that.PayChannel == null : this.PayChannel.equals(that.PayChannel));
    equal = equal && (this.ChannelNumber == null ? that.ChannelNumber == null : this.ChannelNumber.equals(that.ChannelNumber));
    equal = equal && (this.SamId == null ? that.SamId == null : this.SamId.equals(that.SamId));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T50_ONLINE_DEVICE_PAY)) {
      return false;
    }
    T50_ONLINE_DEVICE_PAY that = (T50_ONLINE_DEVICE_PAY) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.Order_no == null ? that.Order_no == null : this.Order_no.equals(that.Order_no));
    equal = equal && (this.Businesstype == null ? that.Businesstype == null : this.Businesstype.equals(that.Businesstype));
    equal = equal && (this.CardIssuerID == null ? that.CardIssuerID == null : this.CardIssuerID.equals(that.CardIssuerID));
    equal = equal && (this.sourceParticipantId == null ? that.sourceParticipantId == null : this.sourceParticipantId.equals(that.sourceParticipantId));
    equal = equal && (this.line_id == null ? that.line_id == null : this.line_id.equals(that.line_id));
    equal = equal && (this.station_id == null ? that.station_id == null : this.station_id.equals(that.station_id));
    equal = equal && (this.device_type == null ? that.device_type == null : this.device_type.equals(that.device_type));
    equal = equal && (this.UDSN == null ? that.UDSN == null : this.UDSN.equals(that.UDSN));
    equal = equal && (this.tx_dt == null ? that.tx_dt == null : this.tx_dt.equals(that.tx_dt));
    equal = equal && (this.tx_tm == null ? that.tx_tm == null : this.tx_tm.equals(that.tx_tm));
    equal = equal && (this.OPBC_time == null ? that.OPBC_time == null : this.OPBC_time.equals(that.OPBC_time));
    equal = equal && (this.RMAC_NUMBER == null ? that.RMAC_NUMBER == null : this.RMAC_NUMBER.equals(that.RMAC_NUMBER));
    equal = equal && (this.data_dt == null ? that.data_dt == null : this.data_dt.equals(that.data_dt));
    equal = equal && (this.ProductCategory == null ? that.ProductCategory == null : this.ProductCategory.equals(that.ProductCategory));
    equal = equal && (this.prod_id == null ? that.prod_id == null : this.prod_id.equals(that.prod_id));
    equal = equal && (this.UD_Type == null ? that.UD_Type == null : this.UD_Type.equals(that.UD_Type));
    equal = equal && (this.UD_SUBTYPE == null ? that.UD_SUBTYPE == null : this.UD_SUBTYPE.equals(that.UD_SUBTYPE));
    equal = equal && (this.CARD_SERIAL_NUMBER == null ? that.CARD_SERIAL_NUMBER == null : this.CARD_SERIAL_NUMBER.equals(that.CARD_SERIAL_NUMBER));
    equal = equal && (this.Ticket_amount == null ? that.Ticket_amount == null : this.Ticket_amount.equals(that.Ticket_amount));
    equal = equal && (this.TicketOrderNumber == null ? that.TicketOrderNumber == null : this.TicketOrderNumber.equals(that.TicketOrderNumber));
    equal = equal && (this.LifeCycle == null ? that.LifeCycle == null : this.LifeCycle.equals(that.LifeCycle));
    equal = equal && (this.AfterTransAmount == null ? that.AfterTransAmount == null : this.AfterTransAmount.equals(that.AfterTransAmount));
    equal = equal && (this.TransType == null ? that.TransType == null : this.TransType.equals(that.TransType));
    equal = equal && (this.TicketStatus == null ? that.TicketStatus == null : this.TicketStatus.equals(that.TicketStatus));
    equal = equal && (this.PayType == null ? that.PayType == null : this.PayType.equals(that.PayType));
    equal = equal && (this.PayStatus == null ? that.PayStatus == null : this.PayStatus.equals(that.PayStatus));
    equal = equal && (this.PayChannel == null ? that.PayChannel == null : this.PayChannel.equals(that.PayChannel));
    equal = equal && (this.ChannelNumber == null ? that.ChannelNumber == null : this.ChannelNumber.equals(that.ChannelNumber));
    equal = equal && (this.SamId == null ? that.SamId == null : this.SamId.equals(that.SamId));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.Order_no = JdbcWritableBridge.readString(2, __dbResults);
    this.Businesstype = JdbcWritableBridge.readString(3, __dbResults);
    this.CardIssuerID = JdbcWritableBridge.readString(4, __dbResults);
    this.sourceParticipantId = JdbcWritableBridge.readString(5, __dbResults);
    this.line_id = JdbcWritableBridge.readString(6, __dbResults);
    this.station_id = JdbcWritableBridge.readString(7, __dbResults);
    this.device_type = JdbcWritableBridge.readString(8, __dbResults);
    this.UDSN = JdbcWritableBridge.readString(9, __dbResults);
    this.tx_dt = JdbcWritableBridge.readDate(10, __dbResults);
    this.tx_tm = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.OPBC_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.RMAC_NUMBER = JdbcWritableBridge.readString(13, __dbResults);
    this.data_dt = JdbcWritableBridge.readDate(14, __dbResults);
    this.ProductCategory = JdbcWritableBridge.readString(15, __dbResults);
    this.prod_id = JdbcWritableBridge.readString(16, __dbResults);
    this.UD_Type = JdbcWritableBridge.readString(17, __dbResults);
    this.UD_SUBTYPE = JdbcWritableBridge.readString(18, __dbResults);
    this.CARD_SERIAL_NUMBER = JdbcWritableBridge.readString(19, __dbResults);
    this.Ticket_amount = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.TicketOrderNumber = JdbcWritableBridge.readString(21, __dbResults);
    this.LifeCycle = JdbcWritableBridge.readString(22, __dbResults);
    this.AfterTransAmount = JdbcWritableBridge.readInteger(23, __dbResults);
    this.TransType = JdbcWritableBridge.readString(24, __dbResults);
    this.TicketStatus = JdbcWritableBridge.readString(25, __dbResults);
    this.PayType = JdbcWritableBridge.readString(26, __dbResults);
    this.PayStatus = JdbcWritableBridge.readString(27, __dbResults);
    this.PayChannel = JdbcWritableBridge.readString(28, __dbResults);
    this.ChannelNumber = JdbcWritableBridge.readString(29, __dbResults);
    this.SamId = JdbcWritableBridge.readString(30, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.Order_no = JdbcWritableBridge.readString(2, __dbResults);
    this.Businesstype = JdbcWritableBridge.readString(3, __dbResults);
    this.CardIssuerID = JdbcWritableBridge.readString(4, __dbResults);
    this.sourceParticipantId = JdbcWritableBridge.readString(5, __dbResults);
    this.line_id = JdbcWritableBridge.readString(6, __dbResults);
    this.station_id = JdbcWritableBridge.readString(7, __dbResults);
    this.device_type = JdbcWritableBridge.readString(8, __dbResults);
    this.UDSN = JdbcWritableBridge.readString(9, __dbResults);
    this.tx_dt = JdbcWritableBridge.readDate(10, __dbResults);
    this.tx_tm = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.OPBC_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.RMAC_NUMBER = JdbcWritableBridge.readString(13, __dbResults);
    this.data_dt = JdbcWritableBridge.readDate(14, __dbResults);
    this.ProductCategory = JdbcWritableBridge.readString(15, __dbResults);
    this.prod_id = JdbcWritableBridge.readString(16, __dbResults);
    this.UD_Type = JdbcWritableBridge.readString(17, __dbResults);
    this.UD_SUBTYPE = JdbcWritableBridge.readString(18, __dbResults);
    this.CARD_SERIAL_NUMBER = JdbcWritableBridge.readString(19, __dbResults);
    this.Ticket_amount = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.TicketOrderNumber = JdbcWritableBridge.readString(21, __dbResults);
    this.LifeCycle = JdbcWritableBridge.readString(22, __dbResults);
    this.AfterTransAmount = JdbcWritableBridge.readInteger(23, __dbResults);
    this.TransType = JdbcWritableBridge.readString(24, __dbResults);
    this.TicketStatus = JdbcWritableBridge.readString(25, __dbResults);
    this.PayType = JdbcWritableBridge.readString(26, __dbResults);
    this.PayStatus = JdbcWritableBridge.readString(27, __dbResults);
    this.PayChannel = JdbcWritableBridge.readString(28, __dbResults);
    this.ChannelNumber = JdbcWritableBridge.readString(29, __dbResults);
    this.SamId = JdbcWritableBridge.readString(30, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(Order_no, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Businesstype, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CardIssuerID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sourceParticipantId, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(line_id, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(station_id, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(device_type, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UDSN, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(tx_dt, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tx_tm, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OPBC_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(RMAC_NUMBER, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(data_dt, 14 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(ProductCategory, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prod_id, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UD_Type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UD_SUBTYPE, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CARD_SERIAL_NUMBER, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Ticket_amount, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TicketOrderNumber, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LifeCycle, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(AfterTransAmount, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(TransType, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TicketStatus, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PayType, 26 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(PayStatus, 27 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(PayChannel, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ChannelNumber, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SamId, 30 + __off, 12, __dbStmt);
    return 30;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(Order_no, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Businesstype, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CardIssuerID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sourceParticipantId, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(line_id, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(station_id, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(device_type, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UDSN, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(tx_dt, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTimestamp(tx_tm, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(OPBC_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(RMAC_NUMBER, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(data_dt, 14 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(ProductCategory, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(prod_id, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UD_Type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UD_SUBTYPE, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CARD_SERIAL_NUMBER, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Ticket_amount, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TicketOrderNumber, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LifeCycle, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(AfterTransAmount, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(TransType, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TicketStatus, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PayType, 26 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(PayStatus, 27 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(PayChannel, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ChannelNumber, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SamId, 30 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Order_no = null;
    } else {
    this.Order_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Businesstype = null;
    } else {
    this.Businesstype = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CardIssuerID = null;
    } else {
    this.CardIssuerID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sourceParticipantId = null;
    } else {
    this.sourceParticipantId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.line_id = null;
    } else {
    this.line_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.station_id = null;
    } else {
    this.station_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.device_type = null;
    } else {
    this.device_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UDSN = null;
    } else {
    this.UDSN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tx_dt = null;
    } else {
    this.tx_dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tx_tm = null;
    } else {
    this.tx_tm = new Timestamp(__dataIn.readLong());
    this.tx_tm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OPBC_time = null;
    } else {
    this.OPBC_time = new Timestamp(__dataIn.readLong());
    this.OPBC_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.RMAC_NUMBER = null;
    } else {
    this.RMAC_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.data_dt = null;
    } else {
    this.data_dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductCategory = null;
    } else {
    this.ProductCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.prod_id = null;
    } else {
    this.prod_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UD_Type = null;
    } else {
    this.UD_Type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UD_SUBTYPE = null;
    } else {
    this.UD_SUBTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CARD_SERIAL_NUMBER = null;
    } else {
    this.CARD_SERIAL_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Ticket_amount = null;
    } else {
    this.Ticket_amount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TicketOrderNumber = null;
    } else {
    this.TicketOrderNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LifeCycle = null;
    } else {
    this.LifeCycle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AfterTransAmount = null;
    } else {
    this.AfterTransAmount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TransType = null;
    } else {
    this.TransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TicketStatus = null;
    } else {
    this.TicketStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PayType = null;
    } else {
    this.PayType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PayStatus = null;
    } else {
    this.PayStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PayChannel = null;
    } else {
    this.PayChannel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ChannelNumber = null;
    } else {
    this.ChannelNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SamId = null;
    } else {
    this.SamId = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.Order_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Order_no);
    }
    if (null == this.Businesstype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Businesstype);
    }
    if (null == this.CardIssuerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CardIssuerID);
    }
    if (null == this.sourceParticipantId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sourceParticipantId);
    }
    if (null == this.line_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, line_id);
    }
    if (null == this.station_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station_id);
    }
    if (null == this.device_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, device_type);
    }
    if (null == this.UDSN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UDSN);
    }
    if (null == this.tx_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tx_dt.getTime());
    }
    if (null == this.tx_tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tx_tm.getTime());
    __dataOut.writeInt(this.tx_tm.getNanos());
    }
    if (null == this.OPBC_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OPBC_time.getTime());
    __dataOut.writeInt(this.OPBC_time.getNanos());
    }
    if (null == this.RMAC_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RMAC_NUMBER);
    }
    if (null == this.data_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.data_dt.getTime());
    }
    if (null == this.ProductCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductCategory);
    }
    if (null == this.prod_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prod_id);
    }
    if (null == this.UD_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UD_Type);
    }
    if (null == this.UD_SUBTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UD_SUBTYPE);
    }
    if (null == this.CARD_SERIAL_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARD_SERIAL_NUMBER);
    }
    if (null == this.Ticket_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Ticket_amount, __dataOut);
    }
    if (null == this.TicketOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TicketOrderNumber);
    }
    if (null == this.LifeCycle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LifeCycle);
    }
    if (null == this.AfterTransAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AfterTransAmount);
    }
    if (null == this.TransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TransType);
    }
    if (null == this.TicketStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TicketStatus);
    }
    if (null == this.PayType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PayType);
    }
    if (null == this.PayStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PayStatus);
    }
    if (null == this.PayChannel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PayChannel);
    }
    if (null == this.ChannelNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ChannelNumber);
    }
    if (null == this.SamId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SamId);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.Order_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Order_no);
    }
    if (null == this.Businesstype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Businesstype);
    }
    if (null == this.CardIssuerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CardIssuerID);
    }
    if (null == this.sourceParticipantId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sourceParticipantId);
    }
    if (null == this.line_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, line_id);
    }
    if (null == this.station_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station_id);
    }
    if (null == this.device_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, device_type);
    }
    if (null == this.UDSN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UDSN);
    }
    if (null == this.tx_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tx_dt.getTime());
    }
    if (null == this.tx_tm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.tx_tm.getTime());
    __dataOut.writeInt(this.tx_tm.getNanos());
    }
    if (null == this.OPBC_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.OPBC_time.getTime());
    __dataOut.writeInt(this.OPBC_time.getNanos());
    }
    if (null == this.RMAC_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RMAC_NUMBER);
    }
    if (null == this.data_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.data_dt.getTime());
    }
    if (null == this.ProductCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductCategory);
    }
    if (null == this.prod_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, prod_id);
    }
    if (null == this.UD_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UD_Type);
    }
    if (null == this.UD_SUBTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UD_SUBTYPE);
    }
    if (null == this.CARD_SERIAL_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARD_SERIAL_NUMBER);
    }
    if (null == this.Ticket_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Ticket_amount, __dataOut);
    }
    if (null == this.TicketOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TicketOrderNumber);
    }
    if (null == this.LifeCycle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LifeCycle);
    }
    if (null == this.AfterTransAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AfterTransAmount);
    }
    if (null == this.TransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TransType);
    }
    if (null == this.TicketStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TicketStatus);
    }
    if (null == this.PayType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PayType);
    }
    if (null == this.PayStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PayStatus);
    }
    if (null == this.PayChannel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PayChannel);
    }
    if (null == this.ChannelNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ChannelNumber);
    }
    if (null == this.SamId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SamId);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"\\N":ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Order_no==null?"\\N":Order_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Businesstype==null?"\\N":Businesstype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CardIssuerID==null?"\\N":CardIssuerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sourceParticipantId==null?"\\N":sourceParticipantId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(line_id==null?"\\N":line_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(station_id==null?"\\N":station_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_type==null?"\\N":device_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UDSN==null?"\\N":UDSN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tx_dt==null?"\\N":"" + tx_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tx_tm==null?"\\N":"" + tx_tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPBC_time==null?"\\N":"" + OPBC_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RMAC_NUMBER==null?"\\N":RMAC_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_dt==null?"\\N":"" + data_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategory==null?"\\N":ProductCategory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prod_id==null?"\\N":prod_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UD_Type==null?"\\N":UD_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UD_SUBTYPE==null?"\\N":UD_SUBTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CARD_SERIAL_NUMBER==null?"\\N":CARD_SERIAL_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ticket_amount==null?"\\N":Ticket_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TicketOrderNumber==null?"\\N":TicketOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LifeCycle==null?"\\N":LifeCycle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AfterTransAmount==null?"\\N":"" + AfterTransAmount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TransType==null?"\\N":TransType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TicketStatus==null?"\\N":TicketStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayType==null?"\\N":PayType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayStatus==null?"\\N":PayStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayChannel==null?"\\N":PayChannel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ChannelNumber==null?"\\N":ChannelNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SamId==null?"\\N":SamId, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"\\N":ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Order_no==null?"\\N":Order_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Businesstype==null?"\\N":Businesstype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CardIssuerID==null?"\\N":CardIssuerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sourceParticipantId==null?"\\N":sourceParticipantId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(line_id==null?"\\N":line_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(station_id==null?"\\N":station_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device_type==null?"\\N":device_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UDSN==null?"\\N":UDSN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tx_dt==null?"\\N":"" + tx_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tx_tm==null?"\\N":"" + tx_tm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPBC_time==null?"\\N":"" + OPBC_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RMAC_NUMBER==null?"\\N":RMAC_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_dt==null?"\\N":"" + data_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategory==null?"\\N":ProductCategory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prod_id==null?"\\N":prod_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UD_Type==null?"\\N":UD_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UD_SUBTYPE==null?"\\N":UD_SUBTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CARD_SERIAL_NUMBER==null?"\\N":CARD_SERIAL_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ticket_amount==null?"\\N":Ticket_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TicketOrderNumber==null?"\\N":TicketOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LifeCycle==null?"\\N":LifeCycle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AfterTransAmount==null?"\\N":"" + AfterTransAmount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TransType==null?"\\N":TransType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TicketStatus==null?"\\N":TicketStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayType==null?"\\N":PayType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayStatus==null?"\\N":PayStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayChannel==null?"\\N":PayChannel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ChannelNumber==null?"\\N":ChannelNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SamId==null?"\\N":SamId, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Order_no = null; } else {
      this.Order_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Businesstype = null; } else {
      this.Businesstype = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CardIssuerID = null; } else {
      this.CardIssuerID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sourceParticipantId = null; } else {
      this.sourceParticipantId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.line_id = null; } else {
      this.line_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.station_id = null; } else {
      this.station_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.device_type = null; } else {
      this.device_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UDSN = null; } else {
      this.UDSN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tx_dt = null; } else {
      this.tx_dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tx_tm = null; } else {
      this.tx_tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPBC_time = null; } else {
      this.OPBC_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.RMAC_NUMBER = null; } else {
      this.RMAC_NUMBER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.data_dt = null; } else {
      this.data_dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ProductCategory = null; } else {
      this.ProductCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.prod_id = null; } else {
      this.prod_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UD_Type = null; } else {
      this.UD_Type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UD_SUBTYPE = null; } else {
      this.UD_SUBTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CARD_SERIAL_NUMBER = null; } else {
      this.CARD_SERIAL_NUMBER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Ticket_amount = null; } else {
      this.Ticket_amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TicketOrderNumber = null; } else {
      this.TicketOrderNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LifeCycle = null; } else {
      this.LifeCycle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AfterTransAmount = null; } else {
      this.AfterTransAmount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TransType = null; } else {
      this.TransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TicketStatus = null; } else {
      this.TicketStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PayType = null; } else {
      this.PayType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PayStatus = null; } else {
      this.PayStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PayChannel = null; } else {
      this.PayChannel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ChannelNumber = null; } else {
      this.ChannelNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SamId = null; } else {
      this.SamId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Order_no = null; } else {
      this.Order_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Businesstype = null; } else {
      this.Businesstype = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CardIssuerID = null; } else {
      this.CardIssuerID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sourceParticipantId = null; } else {
      this.sourceParticipantId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.line_id = null; } else {
      this.line_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.station_id = null; } else {
      this.station_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.device_type = null; } else {
      this.device_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UDSN = null; } else {
      this.UDSN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tx_dt = null; } else {
      this.tx_dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tx_tm = null; } else {
      this.tx_tm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPBC_time = null; } else {
      this.OPBC_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.RMAC_NUMBER = null; } else {
      this.RMAC_NUMBER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.data_dt = null; } else {
      this.data_dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ProductCategory = null; } else {
      this.ProductCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.prod_id = null; } else {
      this.prod_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UD_Type = null; } else {
      this.UD_Type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UD_SUBTYPE = null; } else {
      this.UD_SUBTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CARD_SERIAL_NUMBER = null; } else {
      this.CARD_SERIAL_NUMBER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Ticket_amount = null; } else {
      this.Ticket_amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TicketOrderNumber = null; } else {
      this.TicketOrderNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LifeCycle = null; } else {
      this.LifeCycle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AfterTransAmount = null; } else {
      this.AfterTransAmount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TransType = null; } else {
      this.TransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TicketStatus = null; } else {
      this.TicketStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PayType = null; } else {
      this.PayType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PayStatus = null; } else {
      this.PayStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PayChannel = null; } else {
      this.PayChannel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ChannelNumber = null; } else {
      this.ChannelNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SamId = null; } else {
      this.SamId = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T50_ONLINE_DEVICE_PAY o = (T50_ONLINE_DEVICE_PAY) super.clone();
    o.tx_dt = (o.tx_dt != null) ? (java.sql.Date) o.tx_dt.clone() : null;
    o.tx_tm = (o.tx_tm != null) ? (java.sql.Timestamp) o.tx_tm.clone() : null;
    o.OPBC_time = (o.OPBC_time != null) ? (java.sql.Timestamp) o.OPBC_time.clone() : null;
    o.data_dt = (o.data_dt != null) ? (java.sql.Date) o.data_dt.clone() : null;
    return o;
  }

  public void clone0(T50_ONLINE_DEVICE_PAY o) throws CloneNotSupportedException {
    o.tx_dt = (o.tx_dt != null) ? (java.sql.Date) o.tx_dt.clone() : null;
    o.tx_tm = (o.tx_tm != null) ? (java.sql.Timestamp) o.tx_tm.clone() : null;
    o.OPBC_time = (o.OPBC_time != null) ? (java.sql.Timestamp) o.OPBC_time.clone() : null;
    o.data_dt = (o.data_dt != null) ? (java.sql.Date) o.data_dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("Order_no", this.Order_no);
    __sqoop$field_map.put("Businesstype", this.Businesstype);
    __sqoop$field_map.put("CardIssuerID", this.CardIssuerID);
    __sqoop$field_map.put("sourceParticipantId", this.sourceParticipantId);
    __sqoop$field_map.put("line_id", this.line_id);
    __sqoop$field_map.put("station_id", this.station_id);
    __sqoop$field_map.put("device_type", this.device_type);
    __sqoop$field_map.put("UDSN", this.UDSN);
    __sqoop$field_map.put("tx_dt", this.tx_dt);
    __sqoop$field_map.put("tx_tm", this.tx_tm);
    __sqoop$field_map.put("OPBC_time", this.OPBC_time);
    __sqoop$field_map.put("RMAC_NUMBER", this.RMAC_NUMBER);
    __sqoop$field_map.put("data_dt", this.data_dt);
    __sqoop$field_map.put("ProductCategory", this.ProductCategory);
    __sqoop$field_map.put("prod_id", this.prod_id);
    __sqoop$field_map.put("UD_Type", this.UD_Type);
    __sqoop$field_map.put("UD_SUBTYPE", this.UD_SUBTYPE);
    __sqoop$field_map.put("CARD_SERIAL_NUMBER", this.CARD_SERIAL_NUMBER);
    __sqoop$field_map.put("Ticket_amount", this.Ticket_amount);
    __sqoop$field_map.put("TicketOrderNumber", this.TicketOrderNumber);
    __sqoop$field_map.put("LifeCycle", this.LifeCycle);
    __sqoop$field_map.put("AfterTransAmount", this.AfterTransAmount);
    __sqoop$field_map.put("TransType", this.TransType);
    __sqoop$field_map.put("TicketStatus", this.TicketStatus);
    __sqoop$field_map.put("PayType", this.PayType);
    __sqoop$field_map.put("PayStatus", this.PayStatus);
    __sqoop$field_map.put("PayChannel", this.PayChannel);
    __sqoop$field_map.put("ChannelNumber", this.ChannelNumber);
    __sqoop$field_map.put("SamId", this.SamId);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("Order_no", this.Order_no);
    __sqoop$field_map.put("Businesstype", this.Businesstype);
    __sqoop$field_map.put("CardIssuerID", this.CardIssuerID);
    __sqoop$field_map.put("sourceParticipantId", this.sourceParticipantId);
    __sqoop$field_map.put("line_id", this.line_id);
    __sqoop$field_map.put("station_id", this.station_id);
    __sqoop$field_map.put("device_type", this.device_type);
    __sqoop$field_map.put("UDSN", this.UDSN);
    __sqoop$field_map.put("tx_dt", this.tx_dt);
    __sqoop$field_map.put("tx_tm", this.tx_tm);
    __sqoop$field_map.put("OPBC_time", this.OPBC_time);
    __sqoop$field_map.put("RMAC_NUMBER", this.RMAC_NUMBER);
    __sqoop$field_map.put("data_dt", this.data_dt);
    __sqoop$field_map.put("ProductCategory", this.ProductCategory);
    __sqoop$field_map.put("prod_id", this.prod_id);
    __sqoop$field_map.put("UD_Type", this.UD_Type);
    __sqoop$field_map.put("UD_SUBTYPE", this.UD_SUBTYPE);
    __sqoop$field_map.put("CARD_SERIAL_NUMBER", this.CARD_SERIAL_NUMBER);
    __sqoop$field_map.put("Ticket_amount", this.Ticket_amount);
    __sqoop$field_map.put("TicketOrderNumber", this.TicketOrderNumber);
    __sqoop$field_map.put("LifeCycle", this.LifeCycle);
    __sqoop$field_map.put("AfterTransAmount", this.AfterTransAmount);
    __sqoop$field_map.put("TransType", this.TransType);
    __sqoop$field_map.put("TicketStatus", this.TicketStatus);
    __sqoop$field_map.put("PayType", this.PayType);
    __sqoop$field_map.put("PayStatus", this.PayStatus);
    __sqoop$field_map.put("PayChannel", this.PayChannel);
    __sqoop$field_map.put("ChannelNumber", this.ChannelNumber);
    __sqoop$field_map.put("SamId", this.SamId);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
