// ORM class for table 'T99_TRAIN_PARAMETER_HIS_LOD'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 02 17:20:22 CST 2020
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

public class T99_TRAIN_PARAMETER_HIS_LOD extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Line_ID = (String)value;
      }
    });
    setters.put("Start_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Start_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Train_Compose", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Train_Compose = (Integer)value;
      }
    });
    setters.put("Compartment_Capacity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Compartment_Capacity = (Integer)value;
      }
    });
    setters.put("Train_Fixed_Num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Train_Fixed_Num = (Integer)value;
      }
    });
    setters.put("Full_Carry_Rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Full_Carry_Rate = (java.math.BigDecimal)value;
      }
    });
    setters.put("Operate_Train_Num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.Operate_Train_Num = (Integer)value;
      }
    });
    setters.put("PKM_Operate_Train_Num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.PKM_Operate_Train_Num = (Integer)value;
      }
    });
    setters.put("End_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T99_TRAIN_PARAMETER_HIS_LOD.this.End_Dt = (java.sql.Date)value;
      }
    });
  }
  public T99_TRAIN_PARAMETER_HIS_LOD() {
    init0();
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private java.sql.Date Start_Dt;
  public java.sql.Date get_Start_Dt() {
    return Start_Dt;
  }
  public void set_Start_Dt(java.sql.Date Start_Dt) {
    this.Start_Dt = Start_Dt;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Start_Dt(java.sql.Date Start_Dt) {
    this.Start_Dt = Start_Dt;
    return this;
  }
  private Integer Train_Compose;
  public Integer get_Train_Compose() {
    return Train_Compose;
  }
  public void set_Train_Compose(Integer Train_Compose) {
    this.Train_Compose = Train_Compose;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Train_Compose(Integer Train_Compose) {
    this.Train_Compose = Train_Compose;
    return this;
  }
  private Integer Compartment_Capacity;
  public Integer get_Compartment_Capacity() {
    return Compartment_Capacity;
  }
  public void set_Compartment_Capacity(Integer Compartment_Capacity) {
    this.Compartment_Capacity = Compartment_Capacity;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Compartment_Capacity(Integer Compartment_Capacity) {
    this.Compartment_Capacity = Compartment_Capacity;
    return this;
  }
  private Integer Train_Fixed_Num;
  public Integer get_Train_Fixed_Num() {
    return Train_Fixed_Num;
  }
  public void set_Train_Fixed_Num(Integer Train_Fixed_Num) {
    this.Train_Fixed_Num = Train_Fixed_Num;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Train_Fixed_Num(Integer Train_Fixed_Num) {
    this.Train_Fixed_Num = Train_Fixed_Num;
    return this;
  }
  private java.math.BigDecimal Full_Carry_Rate;
  public java.math.BigDecimal get_Full_Carry_Rate() {
    return Full_Carry_Rate;
  }
  public void set_Full_Carry_Rate(java.math.BigDecimal Full_Carry_Rate) {
    this.Full_Carry_Rate = Full_Carry_Rate;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Full_Carry_Rate(java.math.BigDecimal Full_Carry_Rate) {
    this.Full_Carry_Rate = Full_Carry_Rate;
    return this;
  }
  private Integer Operate_Train_Num;
  public Integer get_Operate_Train_Num() {
    return Operate_Train_Num;
  }
  public void set_Operate_Train_Num(Integer Operate_Train_Num) {
    this.Operate_Train_Num = Operate_Train_Num;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_Operate_Train_Num(Integer Operate_Train_Num) {
    this.Operate_Train_Num = Operate_Train_Num;
    return this;
  }
  private Integer PKM_Operate_Train_Num;
  public Integer get_PKM_Operate_Train_Num() {
    return PKM_Operate_Train_Num;
  }
  public void set_PKM_Operate_Train_Num(Integer PKM_Operate_Train_Num) {
    this.PKM_Operate_Train_Num = PKM_Operate_Train_Num;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_PKM_Operate_Train_Num(Integer PKM_Operate_Train_Num) {
    this.PKM_Operate_Train_Num = PKM_Operate_Train_Num;
    return this;
  }
  private java.sql.Date End_Dt;
  public java.sql.Date get_End_Dt() {
    return End_Dt;
  }
  public void set_End_Dt(java.sql.Date End_Dt) {
    this.End_Dt = End_Dt;
  }
  public T99_TRAIN_PARAMETER_HIS_LOD with_End_Dt(java.sql.Date End_Dt) {
    this.End_Dt = End_Dt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_TRAIN_PARAMETER_HIS_LOD)) {
      return false;
    }
    T99_TRAIN_PARAMETER_HIS_LOD that = (T99_TRAIN_PARAMETER_HIS_LOD) o;
    boolean equal = true;
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Start_Dt == null ? that.Start_Dt == null : this.Start_Dt.equals(that.Start_Dt));
    equal = equal && (this.Train_Compose == null ? that.Train_Compose == null : this.Train_Compose.equals(that.Train_Compose));
    equal = equal && (this.Compartment_Capacity == null ? that.Compartment_Capacity == null : this.Compartment_Capacity.equals(that.Compartment_Capacity));
    equal = equal && (this.Train_Fixed_Num == null ? that.Train_Fixed_Num == null : this.Train_Fixed_Num.equals(that.Train_Fixed_Num));
    equal = equal && (this.Full_Carry_Rate == null ? that.Full_Carry_Rate == null : this.Full_Carry_Rate.equals(that.Full_Carry_Rate));
    equal = equal && (this.Operate_Train_Num == null ? that.Operate_Train_Num == null : this.Operate_Train_Num.equals(that.Operate_Train_Num));
    equal = equal && (this.PKM_Operate_Train_Num == null ? that.PKM_Operate_Train_Num == null : this.PKM_Operate_Train_Num.equals(that.PKM_Operate_Train_Num));
    equal = equal && (this.End_Dt == null ? that.End_Dt == null : this.End_Dt.equals(that.End_Dt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T99_TRAIN_PARAMETER_HIS_LOD)) {
      return false;
    }
    T99_TRAIN_PARAMETER_HIS_LOD that = (T99_TRAIN_PARAMETER_HIS_LOD) o;
    boolean equal = true;
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Start_Dt == null ? that.Start_Dt == null : this.Start_Dt.equals(that.Start_Dt));
    equal = equal && (this.Train_Compose == null ? that.Train_Compose == null : this.Train_Compose.equals(that.Train_Compose));
    equal = equal && (this.Compartment_Capacity == null ? that.Compartment_Capacity == null : this.Compartment_Capacity.equals(that.Compartment_Capacity));
    equal = equal && (this.Train_Fixed_Num == null ? that.Train_Fixed_Num == null : this.Train_Fixed_Num.equals(that.Train_Fixed_Num));
    equal = equal && (this.Full_Carry_Rate == null ? that.Full_Carry_Rate == null : this.Full_Carry_Rate.equals(that.Full_Carry_Rate));
    equal = equal && (this.Operate_Train_Num == null ? that.Operate_Train_Num == null : this.Operate_Train_Num.equals(that.Operate_Train_Num));
    equal = equal && (this.PKM_Operate_Train_Num == null ? that.PKM_Operate_Train_Num == null : this.PKM_Operate_Train_Num.equals(that.PKM_Operate_Train_Num));
    equal = equal && (this.End_Dt == null ? that.End_Dt == null : this.End_Dt.equals(that.End_Dt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Line_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Start_Dt = JdbcWritableBridge.readDate(2, __dbResults);
    this.Train_Compose = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Compartment_Capacity = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Train_Fixed_Num = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Full_Carry_Rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Operate_Train_Num = JdbcWritableBridge.readInteger(7, __dbResults);
    this.PKM_Operate_Train_Num = JdbcWritableBridge.readInteger(8, __dbResults);
    this.End_Dt = JdbcWritableBridge.readDate(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Line_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.Start_Dt = JdbcWritableBridge.readDate(2, __dbResults);
    this.Train_Compose = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Compartment_Capacity = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Train_Fixed_Num = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Full_Carry_Rate = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Operate_Train_Num = JdbcWritableBridge.readInteger(7, __dbResults);
    this.PKM_Operate_Train_Num = JdbcWritableBridge.readInteger(8, __dbResults);
    this.End_Dt = JdbcWritableBridge.readDate(9, __dbResults);
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
    JdbcWritableBridge.writeString(Line_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Start_Dt, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Train_Compose, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Compartment_Capacity, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Train_Fixed_Num, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Full_Carry_Rate, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Operate_Train_Num, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(PKM_Operate_Train_Num, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(End_Dt, 9 + __off, 91, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Line_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Start_Dt, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Train_Compose, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Compartment_Capacity, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Train_Fixed_Num, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Full_Carry_Rate, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Operate_Train_Num, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(PKM_Operate_Train_Num, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(End_Dt, 9 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Line_ID = null;
    } else {
    this.Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Start_Dt = null;
    } else {
    this.Start_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Train_Compose = null;
    } else {
    this.Train_Compose = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Compartment_Capacity = null;
    } else {
    this.Compartment_Capacity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Train_Fixed_Num = null;
    } else {
    this.Train_Fixed_Num = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Full_Carry_Rate = null;
    } else {
    this.Full_Carry_Rate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Operate_Train_Num = null;
    } else {
    this.Operate_Train_Num = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PKM_Operate_Train_Num = null;
    } else {
    this.PKM_Operate_Train_Num = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.End_Dt = null;
    } else {
    this.End_Dt = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Start_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Dt.getTime());
    }
    if (null == this.Train_Compose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Train_Compose);
    }
    if (null == this.Compartment_Capacity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Compartment_Capacity);
    }
    if (null == this.Train_Fixed_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Train_Fixed_Num);
    }
    if (null == this.Full_Carry_Rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Full_Carry_Rate, __dataOut);
    }
    if (null == this.Operate_Train_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Operate_Train_Num);
    }
    if (null == this.PKM_Operate_Train_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PKM_Operate_Train_Num);
    }
    if (null == this.End_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_Dt.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Start_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Start_Dt.getTime());
    }
    if (null == this.Train_Compose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Train_Compose);
    }
    if (null == this.Compartment_Capacity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Compartment_Capacity);
    }
    if (null == this.Train_Fixed_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Train_Fixed_Num);
    }
    if (null == this.Full_Carry_Rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.Full_Carry_Rate, __dataOut);
    }
    if (null == this.Operate_Train_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Operate_Train_Num);
    }
    if (null == this.PKM_Operate_Train_Num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PKM_Operate_Train_Num);
    }
    if (null == this.End_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_Dt.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Dt==null?"\\N":"" + Start_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Train_Compose==null?"\\N":"" + Train_Compose, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Compartment_Capacity==null?"\\N":"" + Compartment_Capacity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Train_Fixed_Num==null?"\\N":"" + Train_Fixed_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Full_Carry_Rate==null?"\\N":Full_Carry_Rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Operate_Train_Num==null?"\\N":"" + Operate_Train_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PKM_Operate_Train_Num==null?"\\N":"" + PKM_Operate_Train_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Dt==null?"\\N":"" + End_Dt, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Start_Dt==null?"\\N":"" + Start_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Train_Compose==null?"\\N":"" + Train_Compose, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Compartment_Capacity==null?"\\N":"" + Compartment_Capacity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Train_Fixed_Num==null?"\\N":"" + Train_Fixed_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Full_Carry_Rate==null?"\\N":Full_Carry_Rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Operate_Train_Num==null?"\\N":"" + Operate_Train_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PKM_Operate_Train_Num==null?"\\N":"" + PKM_Operate_Train_Num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_Dt==null?"\\N":"" + End_Dt, delimiters));
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
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Dt = null; } else {
      this.Start_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Train_Compose = null; } else {
      this.Train_Compose = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Compartment_Capacity = null; } else {
      this.Compartment_Capacity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Train_Fixed_Num = null; } else {
      this.Train_Fixed_Num = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Full_Carry_Rate = null; } else {
      this.Full_Carry_Rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Operate_Train_Num = null; } else {
      this.Operate_Train_Num = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PKM_Operate_Train_Num = null; } else {
      this.PKM_Operate_Train_Num = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_Dt = null; } else {
      this.End_Dt = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Start_Dt = null; } else {
      this.Start_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Train_Compose = null; } else {
      this.Train_Compose = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Compartment_Capacity = null; } else {
      this.Compartment_Capacity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Train_Fixed_Num = null; } else {
      this.Train_Fixed_Num = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Full_Carry_Rate = null; } else {
      this.Full_Carry_Rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Operate_Train_Num = null; } else {
      this.Operate_Train_Num = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PKM_Operate_Train_Num = null; } else {
      this.PKM_Operate_Train_Num = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_Dt = null; } else {
      this.End_Dt = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T99_TRAIN_PARAMETER_HIS_LOD o = (T99_TRAIN_PARAMETER_HIS_LOD) super.clone();
    o.Start_Dt = (o.Start_Dt != null) ? (java.sql.Date) o.Start_Dt.clone() : null;
    o.End_Dt = (o.End_Dt != null) ? (java.sql.Date) o.End_Dt.clone() : null;
    return o;
  }

  public void clone0(T99_TRAIN_PARAMETER_HIS_LOD o) throws CloneNotSupportedException {
    o.Start_Dt = (o.Start_Dt != null) ? (java.sql.Date) o.Start_Dt.clone() : null;
    o.End_Dt = (o.End_Dt != null) ? (java.sql.Date) o.End_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Start_Dt", this.Start_Dt);
    __sqoop$field_map.put("Train_Compose", this.Train_Compose);
    __sqoop$field_map.put("Compartment_Capacity", this.Compartment_Capacity);
    __sqoop$field_map.put("Train_Fixed_Num", this.Train_Fixed_Num);
    __sqoop$field_map.put("Full_Carry_Rate", this.Full_Carry_Rate);
    __sqoop$field_map.put("Operate_Train_Num", this.Operate_Train_Num);
    __sqoop$field_map.put("PKM_Operate_Train_Num", this.PKM_Operate_Train_Num);
    __sqoop$field_map.put("End_Dt", this.End_Dt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Start_Dt", this.Start_Dt);
    __sqoop$field_map.put("Train_Compose", this.Train_Compose);
    __sqoop$field_map.put("Compartment_Capacity", this.Compartment_Capacity);
    __sqoop$field_map.put("Train_Fixed_Num", this.Train_Fixed_Num);
    __sqoop$field_map.put("Full_Carry_Rate", this.Full_Carry_Rate);
    __sqoop$field_map.put("Operate_Train_Num", this.Operate_Train_Num);
    __sqoop$field_map.put("PKM_Operate_Train_Num", this.PKM_Operate_Train_Num);
    __sqoop$field_map.put("End_Dt", this.End_Dt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
