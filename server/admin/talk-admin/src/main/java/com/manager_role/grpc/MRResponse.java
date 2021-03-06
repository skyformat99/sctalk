// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manager_role.proto

package com.manager_role.grpc;

/**
 * Protobuf type {@code com.manager_role.grpc.MRResponse}
 */
public  final class MRResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.manager_role.grpc.MRResponse)
    MRResponseOrBuilder {
  // Use MRResponse.newBuilder() to construct.
  private MRResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MRResponse() {
    id_ = 0;
    roleId_ = 0;
    managerId_ = 0;
    mr_ = java.util.Collections.emptyList();
    statusId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MRResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            roleId_ = input.readInt32();
            break;
          }
          case 16: {

            managerId_ = input.readInt32();
            break;
          }
          case 32: {

            id_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              mr_ = new java.util.ArrayList<com.manager_role.grpc.MR>();
              mutable_bitField0_ |= 0x00000008;
            }
            mr_.add(
                input.readMessage(com.manager_role.grpc.MR.parser(), extensionRegistry));
            break;
          }
          case 48: {

            statusId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        mr_ = java.util.Collections.unmodifiableList(mr_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.manager_role.grpc.ManagerRole.internal_static_com_manager_role_grpc_MRResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.manager_role.grpc.ManagerRole.internal_static_com_manager_role_grpc_MRResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.manager_role.grpc.MRResponse.class, com.manager_role.grpc.MRResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 4;
  private int id_;
  /**
   * <code>int32 id = 4;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int ROLE_ID_FIELD_NUMBER = 1;
  private int roleId_;
  /**
   * <code>int32 role_id = 1;</code>
   */
  public int getRoleId() {
    return roleId_;
  }

  public static final int MANAGER_ID_FIELD_NUMBER = 2;
  private int managerId_;
  /**
   * <code>int32 manager_id = 2;</code>
   */
  public int getManagerId() {
    return managerId_;
  }

  public static final int MR_FIELD_NUMBER = 5;
  private java.util.List<com.manager_role.grpc.MR> mr_;
  /**
   * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
   */
  public java.util.List<com.manager_role.grpc.MR> getMrList() {
    return mr_;
  }
  /**
   * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
   */
  public java.util.List<? extends com.manager_role.grpc.MROrBuilder> 
      getMrOrBuilderList() {
    return mr_;
  }
  /**
   * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
   */
  public int getMrCount() {
    return mr_.size();
  }
  /**
   * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
   */
  public com.manager_role.grpc.MR getMr(int index) {
    return mr_.get(index);
  }
  /**
   * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
   */
  public com.manager_role.grpc.MROrBuilder getMrOrBuilder(
      int index) {
    return mr_.get(index);
  }

  public static final int STATUS_ID_FIELD_NUMBER = 6;
  private int statusId_;
  /**
   * <code>int32 status_id = 6;</code>
   */
  public int getStatusId() {
    return statusId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (roleId_ != 0) {
      output.writeInt32(1, roleId_);
    }
    if (managerId_ != 0) {
      output.writeInt32(2, managerId_);
    }
    if (id_ != 0) {
      output.writeInt32(4, id_);
    }
    for (int i = 0; i < mr_.size(); i++) {
      output.writeMessage(5, mr_.get(i));
    }
    if (statusId_ != 0) {
      output.writeInt32(6, statusId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, roleId_);
    }
    if (managerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, managerId_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, id_);
    }
    for (int i = 0; i < mr_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, mr_.get(i));
    }
    if (statusId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, statusId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.manager_role.grpc.MRResponse)) {
      return super.equals(obj);
    }
    com.manager_role.grpc.MRResponse other = (com.manager_role.grpc.MRResponse) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getRoleId()
        == other.getRoleId());
    result = result && (getManagerId()
        == other.getManagerId());
    result = result && getMrList()
        .equals(other.getMrList());
    result = result && (getStatusId()
        == other.getStatusId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + ROLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRoleId();
    hash = (37 * hash) + MANAGER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getManagerId();
    if (getMrCount() > 0) {
      hash = (37 * hash) + MR_FIELD_NUMBER;
      hash = (53 * hash) + getMrList().hashCode();
    }
    hash = (37 * hash) + STATUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStatusId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.manager_role.grpc.MRResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manager_role.grpc.MRResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.manager_role.grpc.MRResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manager_role.grpc.MRResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.manager_role.grpc.MRResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.manager_role.grpc.MRResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.manager_role.grpc.MRResponse)
      com.manager_role.grpc.MRResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.manager_role.grpc.ManagerRole.internal_static_com_manager_role_grpc_MRResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.manager_role.grpc.ManagerRole.internal_static_com_manager_role_grpc_MRResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.manager_role.grpc.MRResponse.class, com.manager_role.grpc.MRResponse.Builder.class);
    }

    // Construct using com.manager_role.grpc.MRResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMrFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      roleId_ = 0;

      managerId_ = 0;

      if (mrBuilder_ == null) {
        mr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        mrBuilder_.clear();
      }
      statusId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.manager_role.grpc.ManagerRole.internal_static_com_manager_role_grpc_MRResponse_descriptor;
    }

    public com.manager_role.grpc.MRResponse getDefaultInstanceForType() {
      return com.manager_role.grpc.MRResponse.getDefaultInstance();
    }

    public com.manager_role.grpc.MRResponse build() {
      com.manager_role.grpc.MRResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.manager_role.grpc.MRResponse buildPartial() {
      com.manager_role.grpc.MRResponse result = new com.manager_role.grpc.MRResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.roleId_ = roleId_;
      result.managerId_ = managerId_;
      if (mrBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          mr_ = java.util.Collections.unmodifiableList(mr_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.mr_ = mr_;
      } else {
        result.mr_ = mrBuilder_.build();
      }
      result.statusId_ = statusId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.manager_role.grpc.MRResponse) {
        return mergeFrom((com.manager_role.grpc.MRResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.manager_role.grpc.MRResponse other) {
      if (other == com.manager_role.grpc.MRResponse.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getRoleId() != 0) {
        setRoleId(other.getRoleId());
      }
      if (other.getManagerId() != 0) {
        setManagerId(other.getManagerId());
      }
      if (mrBuilder_ == null) {
        if (!other.mr_.isEmpty()) {
          if (mr_.isEmpty()) {
            mr_ = other.mr_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureMrIsMutable();
            mr_.addAll(other.mr_);
          }
          onChanged();
        }
      } else {
        if (!other.mr_.isEmpty()) {
          if (mrBuilder_.isEmpty()) {
            mrBuilder_.dispose();
            mrBuilder_ = null;
            mr_ = other.mr_;
            bitField0_ = (bitField0_ & ~0x00000008);
            mrBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMrFieldBuilder() : null;
          } else {
            mrBuilder_.addAllMessages(other.mr_);
          }
        }
      }
      if (other.getStatusId() != 0) {
        setStatusId(other.getStatusId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.manager_role.grpc.MRResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.manager_role.grpc.MRResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 4;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 4;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 4;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int roleId_ ;
    /**
     * <code>int32 role_id = 1;</code>
     */
    public int getRoleId() {
      return roleId_;
    }
    /**
     * <code>int32 role_id = 1;</code>
     */
    public Builder setRoleId(int value) {
      
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 role_id = 1;</code>
     */
    public Builder clearRoleId() {
      
      roleId_ = 0;
      onChanged();
      return this;
    }

    private int managerId_ ;
    /**
     * <code>int32 manager_id = 2;</code>
     */
    public int getManagerId() {
      return managerId_;
    }
    /**
     * <code>int32 manager_id = 2;</code>
     */
    public Builder setManagerId(int value) {
      
      managerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 manager_id = 2;</code>
     */
    public Builder clearManagerId() {
      
      managerId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.manager_role.grpc.MR> mr_ =
      java.util.Collections.emptyList();
    private void ensureMrIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        mr_ = new java.util.ArrayList<com.manager_role.grpc.MR>(mr_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.manager_role.grpc.MR, com.manager_role.grpc.MR.Builder, com.manager_role.grpc.MROrBuilder> mrBuilder_;

    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public java.util.List<com.manager_role.grpc.MR> getMrList() {
      if (mrBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mr_);
      } else {
        return mrBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public int getMrCount() {
      if (mrBuilder_ == null) {
        return mr_.size();
      } else {
        return mrBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public com.manager_role.grpc.MR getMr(int index) {
      if (mrBuilder_ == null) {
        return mr_.get(index);
      } else {
        return mrBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder setMr(
        int index, com.manager_role.grpc.MR value) {
      if (mrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMrIsMutable();
        mr_.set(index, value);
        onChanged();
      } else {
        mrBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder setMr(
        int index, com.manager_role.grpc.MR.Builder builderForValue) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.set(index, builderForValue.build());
        onChanged();
      } else {
        mrBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder addMr(com.manager_role.grpc.MR value) {
      if (mrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMrIsMutable();
        mr_.add(value);
        onChanged();
      } else {
        mrBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder addMr(
        int index, com.manager_role.grpc.MR value) {
      if (mrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMrIsMutable();
        mr_.add(index, value);
        onChanged();
      } else {
        mrBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder addMr(
        com.manager_role.grpc.MR.Builder builderForValue) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.add(builderForValue.build());
        onChanged();
      } else {
        mrBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder addMr(
        int index, com.manager_role.grpc.MR.Builder builderForValue) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.add(index, builderForValue.build());
        onChanged();
      } else {
        mrBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder addAllMr(
        java.lang.Iterable<? extends com.manager_role.grpc.MR> values) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mr_);
        onChanged();
      } else {
        mrBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder clearMr() {
      if (mrBuilder_ == null) {
        mr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        mrBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public Builder removeMr(int index) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.remove(index);
        onChanged();
      } else {
        mrBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public com.manager_role.grpc.MR.Builder getMrBuilder(
        int index) {
      return getMrFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public com.manager_role.grpc.MROrBuilder getMrOrBuilder(
        int index) {
      if (mrBuilder_ == null) {
        return mr_.get(index);  } else {
        return mrBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public java.util.List<? extends com.manager_role.grpc.MROrBuilder> 
         getMrOrBuilderList() {
      if (mrBuilder_ != null) {
        return mrBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mr_);
      }
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public com.manager_role.grpc.MR.Builder addMrBuilder() {
      return getMrFieldBuilder().addBuilder(
          com.manager_role.grpc.MR.getDefaultInstance());
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public com.manager_role.grpc.MR.Builder addMrBuilder(
        int index) {
      return getMrFieldBuilder().addBuilder(
          index, com.manager_role.grpc.MR.getDefaultInstance());
    }
    /**
     * <code>repeated .com.manager_role.grpc.MR mr = 5;</code>
     */
    public java.util.List<com.manager_role.grpc.MR.Builder> 
         getMrBuilderList() {
      return getMrFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.manager_role.grpc.MR, com.manager_role.grpc.MR.Builder, com.manager_role.grpc.MROrBuilder> 
        getMrFieldBuilder() {
      if (mrBuilder_ == null) {
        mrBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.manager_role.grpc.MR, com.manager_role.grpc.MR.Builder, com.manager_role.grpc.MROrBuilder>(
                mr_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        mr_ = null;
      }
      return mrBuilder_;
    }

    private int statusId_ ;
    /**
     * <code>int32 status_id = 6;</code>
     */
    public int getStatusId() {
      return statusId_;
    }
    /**
     * <code>int32 status_id = 6;</code>
     */
    public Builder setStatusId(int value) {
      
      statusId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status_id = 6;</code>
     */
    public Builder clearStatusId() {
      
      statusId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.manager_role.grpc.MRResponse)
  }

  // @@protoc_insertion_point(class_scope:com.manager_role.grpc.MRResponse)
  private static final com.manager_role.grpc.MRResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.manager_role.grpc.MRResponse();
  }

  public static com.manager_role.grpc.MRResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MRResponse>
      PARSER = new com.google.protobuf.AbstractParser<MRResponse>() {
    public MRResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MRResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MRResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MRResponse> getParserForType() {
    return PARSER;
  }

  public com.manager_role.grpc.MRResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

